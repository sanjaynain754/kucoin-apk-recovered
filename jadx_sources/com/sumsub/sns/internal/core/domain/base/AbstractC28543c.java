package com.sumsub.sns.internal.core.domain.base;

import com.sumsub.sns.core.data.model.SNSApplicantNotFoundException;
import com.sumsub.sns.core.data.model.SNSConfigNotFoundException;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.internal.core.common.AbstractC28393F0;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.base.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28543c {
    /* JADX INFO: renamed from: a */
    public static final Exception m69413a(InterfaceC29953a interfaceC29953a, Exception exc) {
        if (!(exc instanceof SNSException)) {
            if (exc instanceof SNSApplicantNotFoundException) {
                ((C29957e) interfaceC29953a).m70036a(new SNSSDKState.Failed.ApplicantNotFound(exc));
                return exc;
            }
            if (exc instanceof SNSConfigNotFoundException) {
                ((C29957e) interfaceC29953a).m70036a(new SNSSDKState.Failed.InitialLoadingFailed(exc));
            }
            return exc;
        }
        SNSException sNSException = (SNSException) exc;
        if (sNSException instanceof SNSException.Api) {
            Integer code = ((SNSException.Api) exc).getCode();
            if (code == null || code.intValue() != 401) {
                ((C29957e) interfaceC29953a).m70036a(new SNSSDKState.Failed.Unknown(exc));
                return exc;
            }
            ((C29957e) interfaceC29953a).m70036a(SNSSDKState.Failed.Unauthorized.INSTANCE);
            AbstractC28393F0.m69278a(sNSException);
            return exc;
        }
        if (sNSException instanceof SNSException.Unknown) {
            ((C29957e) interfaceC29953a).m70036a(new SNSSDKState.Failed.Unknown(exc));
            return exc;
        }
        if (sNSException instanceof SNSException.Network) {
            ((C29957e) interfaceC29953a).m70036a(new SNSSDKState.Failed.NetworkError(exc));
            return exc;
        }
        if (!(sNSException instanceof SNSException.Internal)) {
            throw new NoWhenBranchMatchedException();
        }
        ((C29957e) interfaceC29953a).m70036a(new SNSSDKState.Failed.Unknown(exc));
        return exc;
    }
}
