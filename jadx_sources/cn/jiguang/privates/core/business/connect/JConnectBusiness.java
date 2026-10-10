package cn.jiguang.privates.core.business.connect;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.component.JCommonReceiver;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.JCore;
import cn.jiguang.privates.core.api.JProtocol;
import cn.jiguang.privates.core.business.connect.tcp.TcpClient;
import cn.jiguang.privates.core.business.connect.udp.UdpClient;
import cn.jiguang.privates.core.cache.JCoreConfig;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.core.global.JCoreGlobal;
import cn.jiguang.privates.core.protocol.JCoreProtocol;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class JConnectBusiness {
    private static final String TAG = "JConnectBusiness";
    private static volatile JConnectBusiness instance;
    private final UdpClient udpClient = new UdpClient();
    private final TcpClient tcpClient = new TcpClient();
    private int ackFailedCount = 0;

    public static JConnectBusiness getInstance() {
        if (instance == null) {
            synchronized (JConnectBusiness.class) {
                instance = new JConnectBusiness();
            }
        }
        return instance;
    }

    public boolean isTcpConnecting() {
        return this.tcpClient.isTcpConnecting();
    }

    public void onAckFailed(Context context) {
        this.ackFailedCount++;
        JCommonLog.m5430d(TAG, "onAckFailed :" + this.ackFailedCount);
        if (this.ackFailedCount < 5) {
            stopHeartbeat(context);
            startHeartbeat(context);
        } else {
            this.ackFailedCount = 0;
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.STOP_CONNECT, null);
        }
    }

    public void onAckSuccess(Context context, Bundle bundle) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(((JProtocol) bundle.getParcelable("protocol")).getBody());
        byte b11 = byteBufferWrap.get();
        byte b12 = byteBufferWrap.get();
        byte b13 = byteBufferWrap.get();
        JCommonLog.m5430d(TAG, "onAckSuccess command:" + ((int) b11) + ", result:" + ((int) b12) + ", code:" + ((int) b13) + ", serverTime:" + byteBufferWrap.getLong());
        if (b11 == 2) {
            JCommonLog.m5432i(TAG, "onHeartbeatSuccess");
            this.ackFailedCount = 0;
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, 2003, null);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.ON_HEARTBEAT, null);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.REPORT, null);
        }
    }

    public void send(Context context, Bundle bundle) {
        this.tcpClient.send(context, bundle);
    }

    public void startHeartbeat(Context context) {
        JCommonLog.m5430d(TAG, "startHeartbeat");
        JCommonPrivatesApi.sendMessageDelayed(context, JCore.THREAD_CORE, JCoreConstants.RemoteWhat.START_HEARTBEAT, null, JCoreGlobal.getHeartbeatInterval());
        JProtocol threadName = new JProtocol().setCommand(2).setVersion(4).setBody(JCoreProtocol.packageHeartbeatBody(context)).setThreadName(JCore.THREAD_CORE);
        Bundle bundle = new Bundle();
        bundle.putParcelable("protocol", threadName);
        send(context, bundle);
    }

    public void stopConnect(Context context) {
        JCommonLog.m5430d(TAG, "stopConnect");
        this.udpClient.stopConnect(context);
        this.tcpClient.stopConnect(context);
    }

    public void stopHeartbeat(Context context) {
        JCommonLog.m5430d(TAG, "stopHeartbeat");
        JCommonPrivatesApi.removeMessages(context, JCore.THREAD_CORE, JCoreConstants.RemoteWhat.START_HEARTBEAT);
    }

    public void turnOffConnect(Context context) {
        JCommonLog.m5430d(TAG, "turnOffConnect");
        JCoreConfig.setConnectState(context, false);
        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.STOP_CONNECT, null);
    }

    public void turnOnConnect(Context context) {
        JCommonLog.m5430d(TAG, "turnOnConnect");
        JCoreConfig.setConnectState(context, true);
        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.START_CONNECT, null);
    }

    public void onTcpConnected(Context context) {
        JCommonReceiver commonReceiver = JGlobal.getCommonReceiver(context);
        if (commonReceiver == null) {
            return;
        }
        commonReceiver.onConnectStatus(context, true);
    }

    public void onTcpDisConnected(Context context) {
        JCommonReceiver commonReceiver = JGlobal.getCommonReceiver(context);
        if (commonReceiver == null) {
            return;
        }
        commonReceiver.onConnectStatus(context, false);
    }

    public void startConnect(Context context) {
        if (!JCoreConfig.getConnectState(context)) {
            JCommonLog.m5433w(TAG, "connect state is false, can't startConnect");
            return;
        }
        JCommonLog.m5430d(TAG, "startConnect");
        this.udpClient.startConnect(context);
        this.tcpClient.startConnect(context);
    }
}
