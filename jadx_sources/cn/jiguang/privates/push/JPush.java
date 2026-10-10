package cn.jiguang.privates.push;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.constants.JCommonConstants;
import cn.jiguang.privates.common.observer.JObserver;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.push.api.JPushPrivatesApi;
import cn.jiguang.privates.push.business.JPushBusiness;
import cn.jiguang.privates.push.business.active.JActiveBusiness;
import cn.jiguang.privates.push.business.message.JMessageBusiness;
import cn.jiguang.privates.push.business.message.custom.JCustomBusiness;
import cn.jiguang.privates.push.business.message.notification.JNotificationBusiness;
import cn.jiguang.privates.push.business.message.platform.JPlatformBusiness;
import cn.jiguang.privates.push.business.operation.alias.JAliasBusiness;
import cn.jiguang.privates.push.business.operation.mobileNumber.JMobileNumberBusiness;
import cn.jiguang.privates.push.business.operation.tag.JTagBusiness;
import cn.jiguang.privates.push.constants.JPushConstants;

/* JADX INFO: loaded from: classes.dex */
public class JPush extends JObserver {
    public static final String THREAD_PUSH = "JIGUANG-PRIVATES-PUSH";

    @Override // cn.jiguang.privates.common.observer.JObserver
    public short getSdkFlag() {
        return (short) 1;
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public int getSdkPriority() {
        return 2;
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public void handleMessage(Context context, int i11, Bundle bundle) {
        if (i11 == 3) {
            JMessageBusiness.getInstance().onMessage(context, bundle);
            return;
        }
        if (i11 == 59) {
            JNotificationBusiness.getInstance().onMessageRevoke(context, bundle);
            return;
        }
        if (i11 == 2001) {
            JPlatformBusiness.getInstance().init(context);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JPushConstants.RemoteWhat.ON_GEOFENCE, null);
            return;
        }
        if (i11 == 2997) {
            JPushBusiness.getInstance().processRemoteNotificationState(context, 0);
            return;
        }
        if (i11 == 2999) {
            JPushBusiness.getInstance().processRemoteNotificationState(context, 2);
            return;
        }
        if (i11 == 3978) {
            JMobileNumberBusiness.getInstance().processRemoteMessage(context, i11, bundle);
            return;
        }
        if (i11 == 3979) {
            JPlatformBusiness.getInstance().processRemoteToken(context, bundle);
            return;
        }
        switch (i11) {
            case 26:
                JMobileNumberBusiness.getInstance().onMobileNumberSuccess(context, bundle);
                break;
            case 27:
                JPlatformBusiness.getInstance().onPlatformTokenSuccess(context, bundle);
                break;
            case 28:
                JTagBusiness.getInstance().onTagOperationSuccess(context, bundle);
                break;
            case 29:
                JAliasBusiness.getInstance().onAliasOperationSuccess(context, bundle);
                break;
            default:
                switch (i11) {
                    case JCommonConstants.RemoteWhat.TO_BACKGROUND /* 1994 */:
                        JActiveBusiness.getInstance().toBackground(context);
                        break;
                    case JCommonConstants.RemoteWhat.TO_FOREGROUND /* 1995 */:
                        JActiveBusiness.getInstance().toForeground(context);
                        JPushBusiness.getInstance().processRemoteNotificationState(context, 1);
                        break;
                    case JCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED /* 1996 */:
                        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.STOP_CONNECT, null);
                        break;
                    case JCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED /* 1997 */:
                        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.START_CONNECT, null);
                        break;
                    default:
                        switch (i11) {
                            case JPushConstants.RemoteWhat.RESET_NOTIFICATION_BADGE /* 3884 */:
                                JPushBusiness.getInstance().resetNotificationBadge(context);
                                break;
                            case JPushConstants.RemoteWhat.SET_NOTIFICATION_BADGE /* 3885 */:
                                JPushBusiness.getInstance().setNotificationBadge(context, bundle);
                                break;
                            case JPushConstants.RemoteWhat.RESET_NOTIFICATION_COUNT /* 3886 */:
                                JPushBusiness.getInstance().resetNotificationCount(context);
                                break;
                            case JPushConstants.RemoteWhat.SET_NOTIFICATION_COUNT /* 3887 */:
                                JPushBusiness.getInstance().setNotificationCount(context, bundle);
                                break;
                            case JPushConstants.RemoteWhat.RESET_NOTIFICATION_LAYOUT /* 3888 */:
                                JPushBusiness.getInstance().resetNotificationLayout(context, bundle);
                                break;
                            case JPushConstants.RemoteWhat.SET_NOTIFICATION_LAYOUT /* 3889 */:
                                JPushBusiness.getInstance().setNotificationLayout(context, bundle);
                                break;
                            case JPushConstants.RemoteWhat.RESET_NOTIFICATION_SILENCE_TIME /* 3890 */:
                                JPushBusiness.getInstance().resetNotificationSilenceTime(context);
                                break;
                            case JPushConstants.RemoteWhat.SET_NOTIFICATION_SILENCE_TIME /* 3891 */:
                                JPushBusiness.getInstance().setNotificationSilenceTime(context, bundle);
                                break;
                            case JPushConstants.RemoteWhat.RESET_NOTIFICATION_SHOW_TIME /* 3892 */:
                                JPushBusiness.getInstance().resetNotificationShowTime(context);
                                break;
                            case JPushConstants.RemoteWhat.SET_NOTIFICATION_SHOW_TIME /* 3893 */:
                                JPushBusiness.getInstance().setNotificationShowTime(context, bundle);
                                break;
                            case JPushConstants.RemoteWhat.CLEAR_NOTIFICATION /* 3894 */:
                                JNotificationBusiness.getInstance().clearNotification(context, bundle);
                                break;
                            case JPushConstants.RemoteWhat.SHOW_NOTIFICATION /* 3895 */:
                                JNotificationBusiness.getInstance().showNotification(context, bundle);
                                break;
                            case JPushConstants.RemoteWhat.ON_NOTIFICATION_MESSAGE /* 3896 */:
                                JNotificationBusiness.getInstance().onMessage(context, bundle);
                                break;
                            case JPushConstants.RemoteWhat.ON_CUSTOM_MESSAGE /* 3897 */:
                                JCustomBusiness.getInstance().onMessage(context, bundle);
                                break;
                            case JPushConstants.RemoteWhat.TURN_OFF_PUSH /* 3898 */:
                                JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.TURN_OFF_CONNECT, null);
                                JCommonPrivatesApi.sendMessageToMainProcess(context, JPushConstants.MainWhat.TURN_OFF_PLATFORM_PUSH, null);
                                break;
                            case JPushConstants.RemoteWhat.TURN_ON_PUSH /* 3899 */:
                                JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.TURN_ON_CONNECT, null);
                                JCommonPrivatesApi.sendMessageToMainProcess(context, 3102, null);
                                break;
                            default:
                                switch (i11) {
                                    case JPushConstants.RemoteWhat.ALIAS_CLEAR /* 3981 */:
                                    case JPushConstants.RemoteWhat.ALIAS_GET /* 3982 */:
                                    case JPushConstants.RemoteWhat.ALIAS_SET /* 3983 */:
                                        JAliasBusiness.getInstance().processRemoteMessage(context, i11, bundle);
                                        break;
                                    case JPushConstants.RemoteWhat.TAG_QUERY_ALL /* 3984 */:
                                    case JPushConstants.RemoteWhat.TAG_DELETE_ALL /* 3985 */:
                                    case JPushConstants.RemoteWhat.TAG_QUERY /* 3986 */:
                                    case JPushConstants.RemoteWhat.TAG_UPDATE /* 3987 */:
                                    case JPushConstants.RemoteWhat.TAG_DELETE /* 3988 */:
                                    case JPushConstants.RemoteWhat.TAG_ADD /* 3989 */:
                                        JTagBusiness.getInstance().processRemoteMessage(context, i11, bundle);
                                        break;
                                    default:
                                        switch (i11) {
                                            case JPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED /* 3998 */:
                                                JPushBusiness.getInstance().processRemoteNotificationState(context, 3);
                                                break;
                                            case JPushConstants.RemoteWhat.ON_CUSTOM_ARRIVED /* 3999 */:
                                                JCustomBusiness.getInstance().processRemoteMessage(context, i11, bundle);
                                                break;
                                        }
                                        JNotificationBusiness.getInstance().processRemoteMessage(context, i11, bundle);
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public boolean isSdk() {
        return true;
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public String getSdkName() {
        return "sdk_ver";
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public String getSdkVersion() {
        return JPushPrivatesApi.SDK_VERSION_NAME;
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public String[] getThreadName() {
        return new String[]{THREAD_PUSH};
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public boolean isSupport(int i11) {
        if (i11 == 3102 || i11 == 3103 || i11 == 3797 || i11 == 3798 || i11 == 3978 || i11 == 3979) {
            return true;
        }
        switch (i11) {
            case 3:
            case 59:
            case 2001:
            case JCoreConstants.RemoteWhat.ON_TCP_CONNECTED /* 2999 */:
            case JPushConstants.RemoteWhat.DELETE_GEOFENCE /* 3880 */:
            case JPushConstants.RemoteWhat.ADD_GEOFENCE /* 3881 */:
            case JPushConstants.RemoteWhat.SET_GEOFENCE_INTERVAL /* 3882 */:
            case JPushConstants.RemoteWhat.SET_GEOFENCE_COUNT /* 3883 */:
            case JPushConstants.RemoteWhat.RESET_NOTIFICATION_BADGE /* 3884 */:
            case JPushConstants.RemoteWhat.SET_NOTIFICATION_BADGE /* 3885 */:
            case JPushConstants.RemoteWhat.RESET_NOTIFICATION_COUNT /* 3886 */:
            case JPushConstants.RemoteWhat.SET_NOTIFICATION_COUNT /* 3887 */:
            case JPushConstants.RemoteWhat.RESET_NOTIFICATION_LAYOUT /* 3888 */:
            case JPushConstants.RemoteWhat.SET_NOTIFICATION_LAYOUT /* 3889 */:
            case JPushConstants.RemoteWhat.RESET_NOTIFICATION_SILENCE_TIME /* 3890 */:
            case JPushConstants.RemoteWhat.SET_NOTIFICATION_SILENCE_TIME /* 3891 */:
            case JPushConstants.RemoteWhat.RESET_NOTIFICATION_SHOW_TIME /* 3892 */:
            case JPushConstants.RemoteWhat.SET_NOTIFICATION_SHOW_TIME /* 3893 */:
            case JPushConstants.RemoteWhat.CLEAR_NOTIFICATION /* 3894 */:
            case JPushConstants.RemoteWhat.SHOW_NOTIFICATION /* 3895 */:
            case JPushConstants.RemoteWhat.ON_NOTIFICATION_MESSAGE /* 3896 */:
            case JPushConstants.RemoteWhat.ON_CUSTOM_MESSAGE /* 3897 */:
            case JPushConstants.RemoteWhat.TURN_OFF_PUSH /* 3898 */:
            case JPushConstants.RemoteWhat.TURN_ON_PUSH /* 3899 */:
            case JPushConstants.RemoteWhat.ON_NOTIFICATION_STATE /* 3994 */:
            case JPushConstants.RemoteWhat.ON_NOTIFICATION_OPENED /* 3995 */:
            case JPushConstants.RemoteWhat.ON_NOTIFICATION_DELETED /* 3996 */:
            case JPushConstants.RemoteWhat.ON_NOTIFICATION_CLICKED /* 3997 */:
            case JPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED /* 3998 */:
            case JPushConstants.RemoteWhat.ON_CUSTOM_ARRIVED /* 3999 */:
                return true;
            default:
                switch (i11) {
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        return true;
                    default:
                        switch (i11) {
                            case JCommonConstants.RemoteWhat.TO_BACKGROUND /* 1994 */:
                            case JCommonConstants.RemoteWhat.TO_FOREGROUND /* 1995 */:
                            case JCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED /* 1996 */:
                            case JCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED /* 1997 */:
                                return true;
                            default:
                                switch (i11) {
                                    case 3001:
                                    case 3002:
                                    case 3003:
                                    case 3004:
                                    case 3005:
                                    case 3006:
                                        return true;
                                    default:
                                        switch (i11) {
                                            case JPushConstants.MainWhat.TAG_ADD /* 3011 */:
                                            case JPushConstants.MainWhat.TAG_DELETE /* 3012 */:
                                            case JPushConstants.MainWhat.TAG_UPDATE /* 3013 */:
                                            case JPushConstants.MainWhat.TAG_QUERY /* 3014 */:
                                            case JPushConstants.MainWhat.TAG_DELETE_ALL /* 3015 */:
                                            case JPushConstants.MainWhat.TAG_QUERY_ALL /* 3016 */:
                                            case JPushConstants.MainWhat.ALIAS_SET /* 3017 */:
                                            case JPushConstants.MainWhat.ALIAS_GET /* 3018 */:
                                            case JPushConstants.MainWhat.ALIAS_CLEAR /* 3019 */:
                                                return true;
                                            default:
                                                switch (i11) {
                                                    case JPushConstants.MainWhat.ON_PLATFORM_TOKEN /* 3021 */:
                                                    case JPushConstants.MainWhat.ON_PLATFORM_NODE /* 3022 */:
                                                    case JPushConstants.MainWhat.ON_MOBILE_NUMBER /* 3023 */:
                                                        return true;
                                                    default:
                                                        switch (i11) {
                                                            case JPushConstants.RemoteWhat.ALIAS_CLEAR /* 3981 */:
                                                            case JPushConstants.RemoteWhat.ALIAS_GET /* 3982 */:
                                                            case JPushConstants.RemoteWhat.ALIAS_SET /* 3983 */:
                                                            case JPushConstants.RemoteWhat.TAG_QUERY_ALL /* 3984 */:
                                                            case JPushConstants.RemoteWhat.TAG_DELETE_ALL /* 3985 */:
                                                            case JPushConstants.RemoteWhat.TAG_QUERY /* 3986 */:
                                                            case JPushConstants.RemoteWhat.TAG_UPDATE /* 3987 */:
                                                            case JPushConstants.RemoteWhat.TAG_DELETE /* 3988 */:
                                                            case JPushConstants.RemoteWhat.TAG_ADD /* 3989 */:
                                                                return true;
                                                            default:
                                                                return false;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public void dispatchMessage(Context context, int i11, Bundle bundle) {
        switch (i11) {
            case 3001:
                JCustomBusiness.getInstance().processMainMessage(context, i11, bundle);
                break;
            case 3002:
            case 3003:
            case 3004:
            case 3005:
                JNotificationBusiness.getInstance().processMainMessage(context, i11, bundle);
                break;
            case 3006:
                JPushBusiness.getInstance().processMainNotificationState(context, bundle);
                break;
            case 3007:
            case 3008:
            case 3009:
            case 3010:
            case 3020:
            default:
                JCommonPrivatesApi.sendMessage(context, THREAD_PUSH, i11, bundle);
                break;
            case JPushConstants.MainWhat.TAG_ADD /* 3011 */:
            case JPushConstants.MainWhat.TAG_DELETE /* 3012 */:
            case JPushConstants.MainWhat.TAG_UPDATE /* 3013 */:
            case JPushConstants.MainWhat.TAG_QUERY /* 3014 */:
            case JPushConstants.MainWhat.TAG_DELETE_ALL /* 3015 */:
            case JPushConstants.MainWhat.TAG_QUERY_ALL /* 3016 */:
                JTagBusiness.getInstance().processMainMessage(context, i11, bundle);
                break;
            case JPushConstants.MainWhat.ALIAS_SET /* 3017 */:
            case JPushConstants.MainWhat.ALIAS_GET /* 3018 */:
            case JPushConstants.MainWhat.ALIAS_CLEAR /* 3019 */:
                JAliasBusiness.getInstance().processMainMessage(context, i11, bundle);
                break;
            case JPushConstants.MainWhat.ON_PLATFORM_TOKEN /* 3021 */:
                JPlatformBusiness.getInstance().processMainToken(context, bundle);
                break;
            case JPushConstants.MainWhat.ON_PLATFORM_NODE /* 3022 */:
                JPlatformBusiness.getInstance().onPlatformNode(context, bundle);
                break;
            case JPushConstants.MainWhat.ON_MOBILE_NUMBER /* 3023 */:
                JMobileNumberBusiness.getInstance().processMainMessage(context, i11, bundle);
                break;
        }
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public void handleDelayMessage(Context context, int i11, Bundle bundle) {
        switch (i11) {
            case 26:
                JMobileNumberBusiness.getInstance().onMobileNumberFailed(context, bundle);
                break;
            case 27:
                JPlatformBusiness.getInstance().onPlatformTokenFailed(context, bundle);
                break;
            case 28:
                JTagBusiness.getInstance().onTagOperationFailed(context, bundle);
                break;
            case 29:
                JAliasBusiness.getInstance().onAliasOperationFailed(context, bundle);
                break;
        }
    }
}
