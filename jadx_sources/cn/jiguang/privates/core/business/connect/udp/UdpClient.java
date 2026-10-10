package cn.jiguang.privates.core.business.connect.udp;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.utils.AESUtil;
import cn.jiguang.privates.common.utils.GZipUtil;
import cn.jiguang.privates.common.utils.SM4Util;
import cn.jiguang.privates.common.utils.StringUtil;
import cn.jiguang.privates.common.utils.SystemUtil;
import cn.jiguang.privates.core.api.Address;
import cn.jiguang.privates.core.api.Outputer;
import cn.jiguang.privates.core.cache.JCoreConfig;
import cn.jiguang.privates.core.global.JCoreGlobal;
import com.tencent.bugly.proguard.C33844oi;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UdpClient {
    private static final int HEAD_LENGTH = 10;
    private static final String KEY_HTTP_ADDRESS = "http_report";
    private static final String KEY_SSL_HTTP_ADDRESS = "https_report";
    private static final String KEY_SSL_TCP_ADDRESS = "ssl_ips";
    private static final String KEY_TCP_ADDRESS = "ips";
    private static final String KEY_UDP_ADDRESS = "sis_ips";
    private static final String TAG = "UdpClient";
    private boolean isUdpConnecting;
    private DatagramSocket socket;

    public void stopConnect(Context context) {
        this.isUdpConnecting = false;
        if (this.socket != null) {
            JCommonLog.m5430d(TAG, "udp disconnect");
            this.socket.close();
        }
    }

    private boolean connect(Context context, String str, int i11) {
        try {
            if (TextUtils.isEmpty(str) || i11 <= 0) {
                return false;
            }
            JCommonLog.m5430d(TAG, "udp connect " + str + C33844oi.f71346o + i11);
            InetAddress byName = InetAddress.getByName(str);
            byte[] bArrPackageRequest = packageRequest(context);
            if (bArrPackageRequest == null) {
                return false;
            }
            DatagramPacket datagramPacket = new DatagramPacket(bArrPackageRequest, bArrPackageRequest.length, byName, i11);
            DatagramSocket datagramSocket = new DatagramSocket();
            this.socket = datagramSocket;
            datagramSocket.setSoTimeout(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
            this.socket.send(datagramPacket);
            byte[] bArr = new byte[1024];
            this.socket.receive(new DatagramPacket(bArr, 1024));
            return parseResponse(context, bArr);
        } catch (Throwable th2) {
            JCommonLog.m5430d(TAG, "udp connect failed " + th2.getMessage());
            return false;
        }
    }

    private byte[] packageRequest(Context context) {
        int i11;
        byte[] bArrEncryptBytes;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("platform", 0);
            jSONObject.put("sdkver", "3.2.2");
            jSONObject.put("appkey", JGlobal.getAppKey(context));
            jSONObject.put("uid", JCoreConfig.getUserId(context));
            jSONObject.put("type", JGlobal.getNetworkType());
            jSONObject.put("opera", JGlobal.getNetworkName());
            JCommonLog.m5430d(TAG, "udp send:" + JCommonLog.toLogString(jSONObject));
            byte[] bArrStringToUtf8Bytes = StringUtil.stringToUtf8Bytes(jSONObject.toString());
            byte[] bArrZip = GZipUtil.zip(bArrStringToUtf8Bytes);
            if (bArrZip == null) {
                i11 = 0;
            } else {
                bArrStringToUtf8Bytes = bArrZip;
                i11 = 1;
            }
            int length = bArrStringToUtf8Bytes.length;
            int iGenerateSeed = AESUtil.generateSeed();
            long j11 = iGenerateSeed;
            String md5AesKey = AESUtil.getMd5AesKey(j11);
            byte b11 = i11 != 0 ? (byte) 1 : (byte) 0;
            int encryptType = JGlobal.getEncryptType();
            if (encryptType == 1) {
                b11 = (byte) (b11 | 16);
                bArrEncryptBytes = AESUtil.encryptBytes(bArrStringToUtf8Bytes, md5AesKey, md5AesKey.substring(0, 16));
            } else if (encryptType != 2) {
                bArrEncryptBytes = AESUtil.encryptBytes(bArrStringToUtf8Bytes, md5AesKey);
            } else {
                b11 = (byte) (b11 | 32);
                bArrEncryptBytes = SM4Util.encryptBytes(bArrStringToUtf8Bytes, md5AesKey, md5AesKey.substring(0, 16));
            }
            Outputer outputer = new Outputer(bArrEncryptBytes.length + 10);
            outputer.writeU16(0);
            outputer.writeByteArray("UG".getBytes());
            outputer.writeU32(j11);
            outputer.writeU8At(b11, 4);
            outputer.writeU16(length);
            outputer.writeByteArray(bArrEncryptBytes);
            outputer.writeU16At(outputer.current(), 0);
            JCommonLog.m5430d(TAG, "send totalLength:" + outputer.current() + ", encryption:" + encryptType + ", compress:" + i11 + ", sid:" + iGenerateSeed);
            return outputer.toByteArray();
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "packageRequest failed " + th2.getMessage());
            return null;
        }
    }

    private boolean parseResponse(Context context, byte[] bArr) {
        try {
            byte[] bArr2 = new byte[10];
            System.arraycopy(bArr, 0, bArr2, 0, 10);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
            short s11 = byteBufferWrap.getShort();
            byteBufferWrap.getShort();
            int i11 = byteBufferWrap.getInt();
            long j11 = 16777215 & i11;
            byteBufferWrap.getShort();
            int i12 = i11 >>> 28;
            int i13 = (i11 >>> 24) & 1;
            String md5AesKey = AESUtil.getMd5AesKey(j11);
            JCommonLog.m5430d(TAG, "receive totalLength:" + ((int) s11) + ", encryption:" + i12 + ", compress:" + i13 + ", sid:" + j11);
            int i14 = s11 - 10;
            byte[] bArr3 = new byte[i14];
            System.arraycopy(bArr, 10, bArr3, 0, i14);
            byte[] bArrDecryptBytes = i12 != 1 ? i12 != 2 ? AESUtil.decryptBytes(bArr3, md5AesKey) : SM4Util.decryptBytes(bArr3, md5AesKey) : AESUtil.decryptBytes(bArr3, md5AesKey, md5AesKey.substring(0, 16));
            if (i13 == 1) {
                bArrDecryptBytes = GZipUtil.unzip(bArrDecryptBytes);
            }
            JSONObject jSONObject = new JSONObject(new String(bArrDecryptBytes));
            JCommonLog.m5430d(TAG, "udp receive " + JCommonLog.toLogString(jSONObject));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(KEY_UDP_ADDRESS);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                Set<String> udpAddress = JCoreConfig.getUdpAddress(context);
                for (int i15 = 0; i15 < jSONArrayOptJSONArray.length(); i15++) {
                    udpAddress.add(String.valueOf(jSONArrayOptJSONArray.get(i15)));
                }
                JCoreConfig.setUdpAddress(context, udpAddress);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(KEY_TCP_ADDRESS);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                Set<String> tcpAddress = JCoreConfig.getTcpAddress(context);
                for (int i16 = 0; i16 < jSONArrayOptJSONArray2.length(); i16++) {
                    tcpAddress.add(String.valueOf(jSONArrayOptJSONArray2.get(i16)));
                }
                JCoreConfig.setTcpAddress(context, tcpAddress);
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(KEY_SSL_TCP_ADDRESS);
            if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                Set<String> tcpAddress2 = JCoreConfig.getTcpAddress(context);
                for (int i17 = 0; i17 < jSONArrayOptJSONArray3.length(); i17++) {
                    tcpAddress2.add(String.valueOf(jSONArrayOptJSONArray3.get(i17)));
                }
                JCoreConfig.setTcpAddress(context, tcpAddress2);
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray(KEY_HTTP_ADDRESS);
            if (jSONArrayOptJSONArray4 != null && jSONArrayOptJSONArray4.length() > 0) {
                Set<String> httpAddress = JCoreConfig.getHttpAddress(context);
                for (int i18 = 0; i18 < jSONArrayOptJSONArray4.length(); i18++) {
                    httpAddress.add("http://" + jSONArrayOptJSONArray4.get(i18));
                }
                JCoreConfig.setHttpAddress(context, httpAddress);
            }
            JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray(KEY_SSL_HTTP_ADDRESS);
            if (jSONArrayOptJSONArray5 != null && jSONArrayOptJSONArray5.length() > 0) {
                Set<String> httpAddress2 = JCoreConfig.getHttpAddress(context);
                for (int i19 = 0; i19 < jSONArrayOptJSONArray5.length(); i19++) {
                    httpAddress2.add("https://" + jSONArrayOptJSONArray5.get(i19));
                }
                JCoreConfig.setHttpAddress(context, httpAddress2);
            }
            return true;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "parseResponse failed " + th2.getMessage());
            return false;
        }
    }

    public void startConnect(Context context) {
        if (this.isUdpConnecting) {
            JCommonLog.m5430d(TAG, "can't connect, isUdpConnecting");
            return;
        }
        this.isUdpConnecting = true;
        Set<String> setPrepareUdpAddress = prepareUdpAddress(context);
        if (setPrepareUdpAddress.isEmpty()) {
            JCommonLog.m5430d(TAG, "there are no udp connect address");
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (int i11 = 0; i11 < 3; i11++) {
            arrayList.addAll(setPrepareUdpAddress);
        }
        for (String str : arrayList) {
            if (!JCoreConfig.getConnectState(context)) {
                JCommonLog.m5430d(TAG, "can't connect ,connect state is false");
                stopConnect(context);
                return;
            } else {
                if (!SystemUtil.isNetworkConnecting(context)) {
                    JCommonLog.m5430d(TAG, "can't connect, network is disConnected");
                    return;
                }
                String[] strArrSplit = str.split(C33844oi.f71346o);
                String str2 = strArrSplit[strArrSplit.length - 1];
                if (connect(context, str.substring(0, (str.length() - str2.length()) - 1), Integer.parseInt(str2))) {
                    return;
                }
            }
        }
    }

    private Set<String> prepareUdpAddress(Context context) {
        Set<String> udpAddress = JCoreConfig.getUdpAddress(context);
        Address address = JCoreGlobal.getAddress();
        int sisPort = address.getSisPort();
        if (sisPort > 0) {
            String[] sisHostArray = address.getSisHostArray();
            if (sisHostArray != null && sisHostArray.length > 0) {
                for (String str : sisHostArray) {
                    udpAddress.add(str + C33844oi.f71346o + sisPort);
                }
            }
            String[] sisIpArray = address.getSisIpArray();
            if (sisIpArray != null && sisIpArray.length > 0) {
                for (String str2 : sisIpArray) {
                    udpAddress.add(str2 + C33844oi.f71346o + sisPort);
                }
            }
        }
        return udpAddress;
    }
}
