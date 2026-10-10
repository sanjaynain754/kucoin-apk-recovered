package com.sumsub.sns.internal.core.common;

import android.os.Parcelable;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.data.model.common.C29143k0;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28476n {
    /* JADX INFO: renamed from: a */
    public static final AbstractC29149l0 m69376a(Throwable th2, Parcelable parcelable) {
        if (th2 instanceof SNSException.Api) {
            SNSException.Api api = (SNSException.Api) th2;
            Integer errorCode = api.getErrorCode();
            return ((errorCode != null && errorCode.intValue() == 1000) || (errorCode != null && errorCode.intValue() == 1001) || ((errorCode != null && errorCode.intValue() == 1002) || ((errorCode != null && errorCode.intValue() == 1003) || ((errorCode != null && errorCode.intValue() == 1004) || ((errorCode != null && errorCode.intValue() == 1005) || ((errorCode != null && errorCode.intValue() == 1006) || ((errorCode != null && errorCode.intValue() == 1007) || ((errorCode != null && errorCode.intValue() == 2000) || ((errorCode != null && errorCode.intValue() == 2001) || ((errorCode != null && errorCode.intValue() == 2002) || ((errorCode != null && errorCode.intValue() == 2003) || ((errorCode != null && errorCode.intValue() == 2004) || (errorCode != null && errorCode.intValue() == 2005))))))))))))) ? new C29143k0(api.getDescription(), api, parcelable, null) : new C29107e0(api, parcelable, null, 4);
        }
        if ((th2 instanceof IOException) || (th2 instanceof SNSException.Network)) {
            return new C29131i0(th2, parcelable, 4);
        }
        if (th2 instanceof CancellationException) {
            return null;
        }
        return new C29107e0(th2, parcelable, null, 4);
    }

    /* JADX INFO: renamed from: a */
    public static final String m69377a(Throwable th2, C29983l c29983l) {
        if (th2 instanceof SNSException.Api) {
            return ((SNSException.Api) th2).getDescription();
        }
        if (th2 instanceof SNSException.Network) {
            return c29983l.m70061a("sns_oops_network_html");
        }
        return th2 instanceof SNSException.Unknown ? ((SNSException.Unknown) th2).getLocalizedMessage() : "Unknown exception";
    }
}
