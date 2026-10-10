package cn.jiguang.privates.core.business.connect.tcp;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.observer.JObservable;
import cn.jiguang.privates.common.observer.JObserver;
import cn.jiguang.privates.common.utils.AESUtil;
import cn.jiguang.privates.common.utils.SM4Util;
import cn.jiguang.privates.common.utils.SystemUtil;
import cn.jiguang.privates.core.JCore;
import cn.jiguang.privates.core.api.Address;
import cn.jiguang.privates.core.api.JProtocol;
import cn.jiguang.privates.core.api.Outputer;
import cn.jiguang.privates.core.business.JCoreBusiness;
import cn.jiguang.privates.core.cache.JCoreConfig;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.core.global.JCoreGlobal;
import cn.jiguang.privates.core.protocol.JCoreProtocol;
import com.tencent.bugly.proguard.C33844oi;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes.dex */
public class TcpClient {
    private static final int AHEAD_LENGTH = 2;
    private static final int HEAD_LENGTH_REQUEST = 26;
    private static final int HEAD_LENGTH_RESPONSE = 22;
    private static final int HEAD_VERSION_DEFAULT = 0;
    private static final int HEAD_VERSION_ENCRYPT = 1;
    private static final String TAG = "TcpClient";
    private boolean isTcpConnecting;
    private boolean isTcpEnable;
    private final ConcurrentMap<JProtocol, String> requestMap = new ConcurrentHashMap();
    private Selector selector;
    private SocketChannel socketChannel;

    public void send(Context context, Bundle bundle) {
        try {
            if (bundle == null) {
                JCommonLog.m5430d(TAG, "can't send, bundle is null");
                return;
            }
            if (bundle.containsKey("data")) {
                if (this.isTcpConnecting && SystemUtil.isNetworkConnecting(context)) {
                    send(context, bundle.getByteArray("data"));
                    return;
                }
                JCommonLog.m5430d(TAG, "can't send data, tcp is not connected");
                disconnect(context);
                return;
            }
            bundle.setClassLoader(JProtocol.class.getClassLoader());
            JProtocol jProtocol = (JProtocol) bundle.getParcelable("protocol");
            if (!SystemUtil.isNetworkConnecting(context)) {
                JCommonLog.m5430d(TAG, "can't send command:" + jProtocol.getCommand() + ", network is disConnected");
                disconnect(context);
                JCommonPrivatesApi.sendMessageDelayed(context, jProtocol.getThreadName(), jProtocol.getCommand(), bundle, 0L);
                return;
            }
            if (!this.isTcpConnecting) {
                JCommonLog.m5430d(TAG, "can't send command:" + jProtocol.getCommand() + ", tcp is disConnected");
                disconnect(context);
                JCommonPrivatesApi.sendMessageDelayed(context, jProtocol.getThreadName(), jProtocol.getCommand(), bundle, 0L);
                return;
            }
            if (jProtocol.getRid() == 0) {
                jProtocol.setRid(JCoreGlobal.getRid());
            }
            JCommonLog.m5430d(TAG, "send " + jProtocol.toString());
            String threadName = jProtocol.getThreadName();
            byte[] bArrPackageRequest = packageRequest(context, jProtocol);
            if (bArrPackageRequest == null) {
                return;
            }
            send(context, bArrPackageRequest);
            if (TextUtils.isEmpty(threadName)) {
                return;
            }
            this.requestMap.put(jProtocol, threadName);
            JCommonPrivatesApi.sendMessageDelayed(context, threadName, jProtocol.getCommand(), bundle, 10000L);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "send failed " + th2.getMessage());
            disconnect(context);
        }
    }

    public void startConnect(Context context) {
        this.isTcpEnable = true;
        if (this.isTcpConnecting) {
            JCommonLog.m5430d(TAG, "can't connect, isTcpConnecting");
            return;
        }
        this.isTcpConnecting = true;
        Set<String> setPrepareTcpAddress = prepareTcpAddress(context);
        if (setPrepareTcpAddress.isEmpty()) {
            JCommonLog.m5433w(TAG, "there are no tcp connect address");
            disconnect(context);
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(setPrepareTcpAddress);
        int connectRetryCount = JCoreGlobal.getConnectRetryCount();
        for (int i11 = 0; i11 < connectRetryCount; i11++) {
            JCommonLog.m5430d(TAG, "connect retry count is " + i11);
            for (String str : arrayList) {
                if (!JCoreConfig.getConnectState(context)) {
                    JCommonLog.m5430d(TAG, "can't connect ,connect state is false");
                    return;
                }
                if (!this.isTcpEnable) {
                    JCommonLog.m5430d(TAG, "can't connect ,tcp state is false");
                    return;
                }
                String[] strArrSplit = str.split(C33844oi.f71346o);
                String str2 = strArrSplit[strArrSplit.length - 1];
                if (!connect(context, str.substring(0, (str.length() - str2.length()) - 1), Integer.parseInt(str2))) {
                    disconnect(context);
                } else if (!register(context)) {
                    disconnect(context);
                } else if (login(context)) {
                    receiving(context);
                } else {
                    disconnect(context);
                }
            }
        }
    }

    public void stopConnect(Context context) {
        this.isTcpEnable = false;
        disconnect(context);
        JCommonPrivatesApi.sendMessageToMainProcess(context, 2002, null);
        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.ON_TCP_DISCONNECTED, null);
    }

    private boolean connect(Context context, String str, int i11) {
        try {
            if (!SystemUtil.isNetworkConnecting(context)) {
                JCommonLog.m5430d(TAG, "can't connect, network is disConnected");
                return false;
            }
            JCommonLog.m5430d(TAG, "tcp connect " + str + C33844oi.f71346o + i11);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i11);
            SocketChannel socketChannelOpen = SocketChannel.open();
            this.socketChannel = socketChannelOpen;
            socketChannelOpen.configureBlocking(false);
            Selector selectorOpen = Selector.open();
            this.selector = selectorOpen;
            this.socketChannel.register(selectorOpen, 8);
            this.socketChannel.connect(inetSocketAddress);
            this.selector.select();
            Set<SelectionKey> setSelectedKeys = this.selector.selectedKeys();
            if (setSelectedKeys == null) {
                JCommonLog.m5430d(TAG, "selectionKeys is null");
                return false;
            }
            if (setSelectedKeys.isEmpty()) {
                JCommonLog.m5430d(TAG, "selectionKeys is empty");
                return false;
            }
            SelectionKey next = setSelectedKeys.iterator().next();
            if (next != null && next.isConnectable()) {
                if (!next.isConnectable()) {
                    JCommonLog.m5430d(TAG, "selectionKey is disConnected");
                    return false;
                }
                SocketChannel socketChannel = (SocketChannel) next.channel();
                if (!socketChannel.isConnectionPending()) {
                    JCommonLog.m5430d(TAG, "finish connect");
                    return false;
                }
                socketChannel.finishConnect();
                socketChannel.register(this.selector, 1);
                JCommonLog.m5430d(TAG, "tcp connect success");
                this.isTcpConnecting = true;
                return true;
            }
            JCommonLog.m5430d(TAG, "selectionKey is null");
            return false;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "tcp connect failed " + th2.getMessage());
            disconnect(context);
            return false;
        }
    }

    private byte[] packageRequest(Context context, JProtocol jProtocol) {
        int i11;
        int i12;
        int i13;
        try {
            int command = jProtocol.getCommand();
            int version = jProtocol.getVersion();
            long userId = JCoreConfig.getUserId(context);
            int seedId = JCoreConfig.getSeedId(context);
            long rid = jProtocol.getRid();
            int encryptType = JGlobal.getEncryptType();
            if (encryptType == 1 || encryptType == 2) {
                i11 = 27;
                i12 = 1;
            } else {
                i11 = 24;
                i12 = 0;
            }
            Outputer outputer = new Outputer(i11);
            if (i12 != 0) {
                outputer.writeU8(i11);
                outputer.writeU8(i12);
                i13 = 1;
            } else {
                i13 = 0;
            }
            outputer.writeU8(command ^ 90);
            outputer.writeU8(version ^ 90);
            outputer.writeU64(userId ^ 6510615555426900570L);
            outputer.writeU32(seedId);
            outputer.writeU64(rid ^ 6510615555426900570L);
            outputer.writeU16(0);
            if (i12 == 1) {
                outputer.writeU8(encryptType);
            }
            byte[] byteArray = outputer.toByteArray();
            byte[] body = jProtocol.getBody();
            String md5AesKey = AESUtil.getMd5AesKey(JCoreConfig.getUserId(context));
            if (encryptType == 0) {
                body = AESUtil.encryptBytes(body, md5AesKey);
            } else if (encryptType == 1) {
                body = AESUtil.encryptBytes(body, md5AesKey, md5AesKey.substring(0, 16));
            } else if (encryptType == 2) {
                body = SM4Util.encryptBytes(body, md5AesKey, md5AesKey.substring(0, 16));
            }
            int length = body.length;
            int i14 = i11 + 2;
            int i15 = i14 + length;
            byte[] bArr = body;
            byte b11 = (byte) ((i15 >>> 8) & 255);
            byte[] bArr2 = {b11, (byte) (i15 & 255)};
            byte b12 = (byte) (b11 | 128);
            bArr2[0] = b12;
            if (i13 != 0) {
                bArr2[0] = (byte) (b12 | 64);
            }
            JCommonLog.m5430d(TAG, "send ahead length:2, encryption:1, expand:" + i13 + ", totalLength:" + i15);
            JCommonLog.m5430d(TAG, "send head  length:" + i11 + ", headVersion:" + i12 + ", command:" + command + ", version:" + version + ", uid:" + userId + ", rid:" + rid + ", crc16:0, encrypt:" + encryptType);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("send body  length:");
            sb2.append(length);
            JCommonLog.m5430d(TAG, sb2.toString());
            byte[] bArr3 = new byte[i15];
            System.arraycopy(bArr2, 0, bArr3, 0, 2);
            System.arraycopy(byteArray, 0, bArr3, 2, i11);
            System.arraycopy(bArr, 0, bArr3, i14, length);
            return bArr3;
        } catch (Throwable unused) {
            return null;
        }
    }

    private JProtocol parseResponse(Context context, byte[] bArr) {
        byte b11;
        byte b12;
        if (bArr == null) {
            return null;
        }
        try {
            JProtocol jProtocol = new JProtocol();
            byte[] bArr2 = new byte[2];
            System.arraycopy(bArr, 0, bArr2, 0, 2);
            short s11 = ByteBuffer.wrap(bArr2).getShort();
            int i11 = (s11 >>> 15) & 1;
            int i12 = (s11 >>> 14) & 1;
            int i13 = s11 & 16383;
            JCommonLog.m5430d(TAG, "receive ahead length:2, encryption:" + i11 + ", expand:" + i12 + ", totalLength:" + i13);
            int i14 = i13 + (-2);
            byte[] bArr3 = new byte[i14];
            System.arraycopy(bArr, 2, bArr3, 0, i14);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr3);
            if (i12 == 1) {
                b11 = byteBufferWrap.get();
                b12 = byteBufferWrap.get();
            } else {
                b11 = 20;
                b12 = 0;
            }
            int i15 = byteBufferWrap.get() ^ BuiltinOptions.MatrixSetDiagOptions;
            int i16 = byteBufferWrap.get() ^ BuiltinOptions.MatrixSetDiagOptions;
            long j11 = byteBufferWrap.getLong() ^ 6510615555426900570L;
            long j12 = byteBufferWrap.getLong() ^ 6510615555426900570L;
            try {
                short s12 = byteBufferWrap.getShort();
                byte b13 = (i12 == 1 && b12 == 1) ? byteBufferWrap.get() : (byte) 0;
                jProtocol.setCommand(i15);
                jProtocol.setVersion(i16);
                jProtocol.setRid(j12);
                JCommonLog.m5430d(TAG, "receive head  length:" + ((int) b11) + ", headVersion:" + ((int) b12) + ", command:" + i15 + ", version:" + i16 + ", uid:" + j11 + ", rid:" + j12 + ", crc16:" + ((int) s12) + ", encrypt:" + ((int) b13));
                int i17 = (i13 - b11) + (-2);
                byte[] bArrDecryptBytes = new byte[i17];
                System.arraycopy(bArr3, b11, bArrDecryptBytes, 0, i17);
                String md5AesKey = AESUtil.getMd5AesKey(JCoreConfig.getUserId(context));
                if (b13 == 0) {
                    bArrDecryptBytes = AESUtil.decryptBytes(bArrDecryptBytes, md5AesKey);
                } else if (b13 == 1) {
                    bArrDecryptBytes = AESUtil.decryptBytes(bArrDecryptBytes, md5AesKey, md5AesKey.substring(0, 16));
                } else if (b13 == 2) {
                    bArrDecryptBytes = SM4Util.decryptBytes(bArrDecryptBytes, md5AesKey);
                }
                jProtocol.setBody(bArrDecryptBytes);
                JCommonLog.m5430d(TAG, "receive body  length:" + i17 + ", decryptBodyLength:" + bArrDecryptBytes.length);
                return jProtocol;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private void processResponse(Context context, JProtocol jProtocol) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("protocol", jProtocol);
        Iterator<JProtocol> it = this.requestMap.keySet().iterator();
        while (it.hasNext()) {
            JProtocol next = it.next();
            if (next.getRid() == jProtocol.getRid()) {
                String str = this.requestMap.get(next);
                jProtocol.setThreadName(str);
                JCommonLog.m5430d(TAG, "receive " + jProtocol.toString());
                it.remove();
                JCommonPrivatesApi.removeMessages(context, str, next.getCommand());
                JCommonPrivatesApi.sendMessage(context, str, jProtocol.getCommand(), bundle);
                return;
            }
        }
        for (JObserver jObserver : JObservable.getInstance().observeQueue) {
            if (jObserver.isSupport(jProtocol.getCommand())) {
                String str2 = jObserver.getThreadName()[0];
                jProtocol.setThreadName(str2);
                JCommonLog.m5430d(TAG, "receive " + jProtocol.toString());
                JCommonPrivatesApi.sendMessage(context, str2, jProtocol.getCommand(), bundle);
            }
        }
    }

    private void receiving(Context context) {
        byte[] bArrReceive;
        JCommonLog.m5430d(TAG, "receiving......");
        while (this.isTcpConnecting && (bArrReceive = receive(context)) != null) {
            JProtocol response = parseResponse(context, bArrReceive);
            if (response == null) {
                JCommonLog.m5430d(TAG, "parseResponse failed");
            } else {
                processResponse(context, response);
            }
        }
    }

    public boolean isTcpConnecting() {
        return this.isTcpConnecting;
    }

    public byte[] receive(Context context) {
        try {
            if (!this.isTcpConnecting) {
                JCommonLog.m5430d(TAG, "tcp is not connecting");
                return null;
            }
            this.selector.select();
            if (!this.selector.isOpen()) {
                JCommonLog.m5430d(TAG, "selector is closed");
                return null;
            }
            Set<SelectionKey> setSelectedKeys = this.selector.selectedKeys();
            if (setSelectedKeys == null) {
                JCommonLog.m5433w(TAG, "selectionKeys is null");
                disconnect(context);
                return null;
            }
            if (setSelectedKeys.isEmpty()) {
                JCommonLog.m5433w(TAG, "selectionKeys is empty");
                disconnect(context);
                return null;
            }
            Iterator<SelectionKey> it = setSelectedKeys.iterator();
            if (!it.hasNext()) {
                JCommonLog.m5433w(TAG, "selectionKeys hasn't next");
                disconnect(context);
                return null;
            }
            SelectionKey next = it.next();
            if (next == null) {
                JCommonLog.m5433w(TAG, "selectionKey is null");
                disconnect(context);
                return null;
            }
            if (!next.isReadable()) {
                JCommonLog.m5433w(TAG, "selectionKey is disReadable");
                disconnect(context);
                return null;
            }
            SocketChannel socketChannel = (SocketChannel) next.channel();
            if (!socketChannel.isConnected()) {
                JCommonLog.m5433w(TAG, "socketChannel is disConnected");
                disconnect(context);
                return null;
            }
            if (this.isTcpConnecting) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
                int i11 = socketChannel.read(byteBufferAllocate);
                if (i11 < 0) {
                    JCommonLog.m5433w(TAG, "read ahead length = " + i11);
                    disconnect(context);
                    return null;
                }
                byte[] bArrArray = byteBufferAllocate.array();
                int i12 = ByteBuffer.wrap(bArrArray).getShort() & 16383;
                if (i12 == 0) {
                    JCommonLog.m5433w(TAG, "read total length = " + i12);
                    disconnect(context);
                    return null;
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i12 - 2);
                int i13 = socketChannel.read(byteBufferAllocate2);
                if (i13 != 0) {
                    byte[] bArrArray2 = byteBufferAllocate2.array();
                    byte[] bArr = new byte[i12];
                    System.arraycopy(bArrArray, 0, bArr, 0, bArrArray.length);
                    System.arraycopy(bArrArray2, 0, bArr, bArrArray.length, bArrArray2.length);
                    return bArr;
                }
                JCommonLog.m5433w(TAG, "read content length = " + i13);
                disconnect(context);
                return null;
            }
            return null;
        } catch (IOException e11) {
            JCommonLog.m5433w(TAG, "receive IOException " + e11.getMessage());
            disconnect(context);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "receive failed " + th2.getMessage());
            disconnect(context);
        }
    }

    private void disconnect(Context context) {
        JCommonLog.m5430d(TAG, "tcp disconnect");
        this.isTcpConnecting = false;
        JCommonPrivatesApi.removeMessages(context, JCore.THREAD_CORE, JCoreConstants.RemoteWhat.START_HEARTBEAT);
        try {
            Selector selector = this.selector;
            if (selector != null && selector.isOpen()) {
                this.selector.close();
                this.selector = null;
            }
            SocketChannel socketChannel = this.socketChannel;
            if (socketChannel != null && socketChannel.isConnected()) {
                this.socketChannel.finishConnect();
                this.socketChannel.close();
                this.socketChannel = null;
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "disconnect failed " + th2.getMessage());
        }
    }

    private boolean login(Context context) {
        JProtocol threadName = new JProtocol().setRid(JCoreGlobal.getRid()).setCommand(1).setVersion(23).setBody(JCoreProtocol.packageLoginBody(context)).setThreadName(JCore.THREAD_CONNECT);
        if (threadName == null) {
            JCommonLog.m5433w(TAG, "login failed, send request failed");
            return false;
        }
        JCommonLog.m5430d(TAG, "send " + threadName.toString());
        send(context, packageRequest(context, threadName));
        JProtocol response = parseResponse(context, receive(context));
        if (response == null) {
            JCommonLog.m5433w(TAG, "login failed, receive response failed");
            return false;
        }
        JCommonLog.m5430d(TAG, "receive " + response.toString());
        if (JCoreProtocol.parseLoginBody(context, response.getBody()) == 0) {
            JCoreBusiness.getInstance().onRemoteLoginInfo(context);
            JCommonPrivatesApi.sendMessageToMainProcess(context, 2001, null);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.ON_TCP_CONNECTED, null);
            return true;
        }
        JCommonPrivatesApi.sendMessageToMainProcess(context, 2002, null);
        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.ON_TCP_DISCONNECTED, null);
        return false;
    }

    private Set<String> prepareTcpAddress(Context context) {
        Set<String> tcpAddress = JCoreConfig.getTcpAddress(context);
        Address address = JCoreGlobal.getAddress();
        int defaultPort = address.getDefaultPort();
        if (defaultPort > 0) {
            String defaultHost = address.getDefaultHost();
            if (!TextUtils.isEmpty(defaultHost)) {
                tcpAddress.add(defaultHost + C33844oi.f71346o + defaultPort);
            }
            String defaultIp = address.getDefaultIp();
            if (!TextUtils.isEmpty(defaultIp)) {
                tcpAddress.add(defaultIp + C33844oi.f71346o + defaultPort);
            }
        }
        return tcpAddress;
    }

    private boolean register(Context context) {
        long userId = JCoreConfig.getUserId(context);
        String registrationId = JCoreConfig.getRegistrationId(context);
        String password = JCoreConfig.getPassword(context);
        JCommonLog.m5430d(TAG, "register uid:" + userId + ",rid:" + registrationId + ",password:" + password);
        if (userId > 0 && !TextUtils.isEmpty(registrationId) && !TextUtils.isEmpty(password)) {
            return true;
        }
        JProtocol threadName = new JProtocol().setRid(JCoreGlobal.getRid()).setCommand(0).setVersion(19).setBody(JCoreProtocol.packageRegisterBody(context)).setThreadName(JCore.THREAD_CONNECT);
        if (threadName == null) {
            JCommonLog.m5433w(TAG, "register failed, send request failed");
            return false;
        }
        JCommonLog.m5430d(TAG, "send " + threadName.toString());
        send(context, packageRequest(context, threadName));
        JProtocol response = parseResponse(context, receive(context));
        if (response == null) {
            JCommonLog.m5433w(TAG, "register failed, receive response failed");
            return false;
        }
        JCommonLog.m5430d(TAG, "receive " + response.toString());
        if (JCoreProtocol.parseRegisterBody(context, response.getBody()) == 0) {
            JCoreBusiness.getInstance().onRemoteRegisterInfo(context);
            return true;
        }
        JCommonPrivatesApi.sendMessageToMainProcess(context, 2002, null);
        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.ON_TCP_DISCONNECTED, null);
        return false;
    }

    private void send(Context context, byte[] bArr) {
        try {
            if (!this.isTcpConnecting) {
                JCommonLog.m5430d(TAG, "can't send, tcp is not connected");
                return;
            }
            SocketChannel socketChannel = this.socketChannel;
            if (socketChannel != null && socketChannel.isConnected()) {
                this.socketChannel.write(ByteBuffer.wrap(bArr));
            }
        } catch (IOException e11) {
            JCommonLog.m5433w(TAG, "send IOException " + e11.getMessage());
            disconnect(context);
        } catch (NotYetConnectedException e12) {
            JCommonLog.m5433w(TAG, "send NotYetConnectedException " + e12.getMessage());
            disconnect(context);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "send throwable " + th2.getMessage());
            disconnect(context);
        }
    }
}
