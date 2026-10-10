package cn.jiguang.privates.core;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.observer.JObserver;
import cn.jiguang.privates.core.business.JCoreBusiness;
import cn.jiguang.privates.core.business.active.JActiveBusiness;
import cn.jiguang.privates.core.business.connect.JConnectBusiness;
import cn.jiguang.privates.core.business.report.JReportBusiness;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.core.global.JCoreGlobal;

/* JADX INFO: loaded from: classes.dex */
public class JCore extends JObserver {
    public static final String THREAD_CONNECT = "JIGUANG-PRIVATES-CONNECT";
    public static final String THREAD_CORE = "JIGUANG-PRIVATES-CORE";
    public static final String THREAD_REPORT = "JIGUANG-PRIVATES-REPORT";

    @Override // cn.jiguang.privates.common.observer.JObserver
    public short getSdkFlag() {
        return (short) 0;
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public int getSdkPriority() {
        return 1;
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public void handleDelayMessage(Context context, int i11, Bundle bundle) {
        if (i11 == 2) {
            JConnectBusiness.getInstance().onAckFailed(context);
        } else if (i11 == 2234) {
            JReportBusiness.getInstance().reportCacheNew(context);
        } else {
            if (i11 != 2992) {
                return;
            }
            JConnectBusiness.getInstance().startHeartbeat(context);
        }
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public boolean isSdk() {
        return true;
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public boolean isSupport(int i11) {
        if (i11 == 2 || i11 == 19 || i11 == 25 || i11 == 1005 || i11 == 2222 || i11 == 1994 || i11 == 1995 || i11 == 1998 || i11 == 1999 || i11 == 2001 || i11 == 2002 || i11 == 2233 || i11 == 2234 || i11 == 2998 || i11 == 2999) {
            return true;
        }
        switch (i11) {
            case 2101:
            case 2102:
            case 2103:
            case 2104:
                return true;
            default:
                switch (i11) {
                    case JCoreConstants.RemoteWhat.STOP_HEARTBEAT /* 2991 */:
                    case JCoreConstants.RemoteWhat.START_HEARTBEAT /* 2992 */:
                    case JCoreConstants.RemoteWhat.STOP_CONNECT /* 2993 */:
                    case JCoreConstants.RemoteWhat.START_CONNECT /* 2994 */:
                    case JCoreConstants.RemoteWhat.TURN_OFF_CONNECT /* 2995 */:
                    case JCoreConstants.RemoteWhat.TURN_ON_CONNECT /* 2996 */:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public void dispatchMessage(Context context, int i11, Bundle bundle) {
        if (i11 == 1005) {
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.REPORT_CACHE, Bundle.EMPTY);
            return;
        }
        if (i11 == 2001) {
            JConnectBusiness.getInstance().onTcpConnected(context);
            return;
        }
        if (i11 == 2002) {
            JConnectBusiness.getInstance().onTcpDisConnected(context);
            return;
        }
        if (i11 == 2233) {
            JCommonPrivatesApi.sendMessage(context, THREAD_REPORT, i11, bundle);
            return;
        }
        if (i11 == 2234) {
            JCommonPrivatesApi.sendMessageDelayed(context, THREAD_REPORT, i11, bundle, 3000L);
            return;
        }
        if (i11 == 2993) {
            JCommonPrivatesApi.releaseHandler(context, THREAD_CONNECT);
            JCommonPrivatesApi.sendMessage(context, THREAD_CONNECT, i11, bundle);
        } else if (i11 != 2994) {
            JCommonPrivatesApi.buildHandler(context, THREAD_CORE, (int) (JCoreGlobal.getHeartbeatInterval() + 10000));
            JCommonPrivatesApi.sendMessage(context, THREAD_CORE, i11, bundle);
        } else {
            JCommonPrivatesApi.buildHandler(context, THREAD_CONNECT, (int) (JCoreGlobal.getHeartbeatInterval() + 10000));
            JCommonPrivatesApi.sendMessage(context, THREAD_CONNECT, i11, bundle);
        }
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public String getSdkName() {
        return "core_sdk_ver";
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public String getSdkVersion() {
        return "3.2.2";
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public String[] getThreadName() {
        return new String[]{THREAD_CORE, THREAD_REPORT, THREAD_CONNECT};
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public void handleMessage(Context context, int i11, Bundle bundle) {
        if (i11 == 19) {
            JConnectBusiness.getInstance().onAckSuccess(context, bundle);
            return;
        }
        if (i11 == 25) {
            JCoreBusiness.getInstance().onCtrl(context, bundle);
            return;
        }
        if (i11 == 1999) {
            JCoreBusiness.getInstance().onRemoteRegisterInfo(context);
            JCoreBusiness.getInstance().onRemoteLoginInfo(context);
            return;
        }
        if (i11 == 2222) {
            JConnectBusiness.getInstance().send(context, bundle);
            return;
        }
        if (i11 == 2233) {
            JReportBusiness.getInstance().report(context, bundle);
            return;
        }
        if (i11 == 1994) {
            JActiveBusiness.getInstance().toBackground(context);
            return;
        }
        if (i11 == 1995) {
            JActiveBusiness.getInstance().toForeground(context);
            return;
        }
        if (i11 != 2998) {
            if (i11 != 2999) {
                switch (i11) {
                    case 2101:
                        JCoreBusiness.getInstance().onMainRegisterInfo(context, bundle);
                        break;
                    case 2102:
                        JCoreBusiness.getInstance().onMainLoginInfo(context, bundle);
                        break;
                    case 2103:
                        JReportBusiness.getInstance().reportSave(context, bundle);
                        break;
                    case 2104:
                        JReportBusiness.getInstance().reportOnly(context, bundle);
                        break;
                    default:
                        switch (i11) {
                            case JCoreConstants.RemoteWhat.STOP_CONNECT /* 2993 */:
                                JConnectBusiness.getInstance().stopConnect(context);
                                break;
                            case JCoreConstants.RemoteWhat.START_CONNECT /* 2994 */:
                                JConnectBusiness.getInstance().startConnect(context);
                                break;
                            case JCoreConstants.RemoteWhat.TURN_OFF_CONNECT /* 2995 */:
                                JConnectBusiness.getInstance().turnOffConnect(context);
                                break;
                            case JCoreConstants.RemoteWhat.TURN_ON_CONNECT /* 2996 */:
                                JConnectBusiness.getInstance().turnOnConnect(context);
                                break;
                        }
                        break;
                }
                return;
            }
            JConnectBusiness.getInstance().startHeartbeat(context);
            return;
        }
        JConnectBusiness.getInstance().stopHeartbeat(context);
    }
}
