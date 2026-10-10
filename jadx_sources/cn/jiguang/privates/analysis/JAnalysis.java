package cn.jiguang.privates.analysis;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.analysis.api.JAnalysisPrivatesApi;
import cn.jiguang.privates.analysis.business.account.JAccountBusiness;
import cn.jiguang.privates.analysis.business.active.JActiveBusiness;
import cn.jiguang.privates.analysis.business.crash.JCrashBusiness;
import cn.jiguang.privates.analysis.business.event.JEventBusiness;
import cn.jiguang.privates.analysis.business.exposure.JExposureBusiness;
import cn.jiguang.privates.analysis.business.message.JMessageStateBusiness;
import cn.jiguang.privates.analysis.business.report.JReportBusiness;
import cn.jiguang.privates.analysis.cache.JAnalysisTransferConfig;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.observer.JObserver;

/* JADX INFO: loaded from: classes34.dex */
public class JAnalysis extends JObserver {
    public static final String THREAD_ANALYSIS = "JIGUANG-PRIVATES-ANALYSIS";

    @Override // cn.jiguang.privates.common.observer.JObserver
    public short getSdkFlag() {
        return (short) 4;
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public int getSdkPriority() {
        return 3;
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public boolean isSdk() {
        return true;
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public void dispatchMessage(Context context, int i11, Bundle bundle) {
        JCommonPrivatesApi.sendMessage(context, THREAD_ANALYSIS, i11, bundle);
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public String getSdkVersion() {
        return JAnalysisPrivatesApi.SDK_VERSION_NAME;
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public String[] getThreadName() {
        return new String[]{THREAD_ANALYSIS};
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public void handleMessage(Context context, int i11, Bundle bundle) {
        if (i11 == 1005) {
            JActiveBusiness.getInstance().toForeground(context);
            return;
        }
        if (i11 == 1006) {
            JActiveBusiness.getInstance().toBackground(context);
            return;
        }
        if (i11 == 1011) {
            JExposureBusiness.getInstance().onActivityCreated(context, bundle);
            return;
        }
        if (i11 == 1016) {
            JExposureBusiness.getInstance().onActivityDestroyed(context, bundle);
            return;
        }
        if (i11 != 2003) {
            if (i11 == 1013) {
                JExposureBusiness.getInstance().onActivityResumed(context, bundle);
                return;
            }
            if (i11 == 1014) {
                JExposureBusiness.getInstance().onActivityPaused(context, bundle);
                return;
            }
            if (i11 == 3201) {
                JMessageStateBusiness.getInstance().onMessageState(context, bundle);
                return;
            }
            if (i11 == 3202) {
                JMessageStateBusiness.getInstance().onPlatformMessageState(context, bundle);
                return;
            }
            switch (i11) {
                case 4001:
                    JAnalysisTransferConfig.initConfig(context);
                    JCrashBusiness.getInstance().init(context);
                    JActiveBusiness.getInstance().init(context);
                    JAccountBusiness.getInstance().init(context);
                    break;
                case 4002:
                    JEventBusiness.getInstance().onEvent(context, bundle);
                    break;
                case 4003:
                    JAccountBusiness.getInstance().onAccount(context, bundle);
                    break;
                case 4004:
                    break;
                case 4005:
                    JExposureBusiness.getInstance().onDrawDone(context);
                    break;
                default:
                    switch (i11) {
                        case JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY /* 4101 */:
                            JEventBusiness.getInstance().setCommonProperty(context, bundle);
                            break;
                        case JAnalysisConstants.MainWhat.CLEAR_STATIC_PROPERTY /* 4102 */:
                            JEventBusiness.getInstance().clearCommonProperty(context);
                            break;
                        case JAnalysisConstants.MainWhat.SET_DYNAMIC_PROPERTY /* 4103 */:
                            JEventBusiness.getInstance().setDynamicProperty(context, bundle);
                            break;
                        case JAnalysisConstants.MainWhat.CLEAR_DYNAMIC_PROPERTY /* 4104 */:
                            JEventBusiness.getInstance().clearDynamicProperty(context);
                            break;
                    }
                    break;
            }
            return;
        }
        JReportBusiness.getInstance().reportCache(context);
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public boolean isSupport(int i11) {
        if (i11 == 1005 || i11 == 1006 || i11 == 1011 || i11 == 1016 || i11 == 1013 || i11 == 1014 || i11 == 3201 || i11 == 3202) {
            return true;
        }
        switch (i11) {
            case 4001:
            case 4002:
            case 4003:
            case 4004:
            case 4005:
                return true;
            default:
                switch (i11) {
                    case JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY /* 4101 */:
                    case JAnalysisConstants.MainWhat.CLEAR_STATIC_PROPERTY /* 4102 */:
                    case JAnalysisConstants.MainWhat.SET_DYNAMIC_PROPERTY /* 4103 */:
                    case JAnalysisConstants.MainWhat.CLEAR_DYNAMIC_PROPERTY /* 4104 */:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public String getSdkName() {
        return "statistics_sdk_ver";
    }
}
