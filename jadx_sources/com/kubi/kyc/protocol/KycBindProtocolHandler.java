package com.kubi.kyc.protocol;

import android.content.Context;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.user.config.UserInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kyc.protocol.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KycBindProtocolHandler.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\f\u0010\f\u001a\u00020\r*\u00020\u000bH\u0002J\u001c\u0010\t\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/kyc/protocol/KycBindProtocolHandler;", "", "<init>", "()V", "gotoBindEmail", "Lcom/kubi/kyc/protocol/KycBindProtocolResult;", "context", "Landroid/content/Context;", "gotoBindPhone", "bind", "bindType", "Lcom/kubi/kyc/protocol/KycBindType;", "isAlreadyBound", "", "", "safeService", "Lcom/kubi/safe/api/service/ISafeService;", "TAG", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KycBindProtocolHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KycBindProtocolHandler f31261a = new KycBindProtocolHandler();

    /* JADX INFO: renamed from: com.kubi.kyc.protocol.e$a */
    /* JADX INFO: compiled from: KycBindProtocolHandler.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KycBindType.values().length];
            try {
                iArr[KycBindType.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KycBindType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m36861b(KycBindType kycBindType, ISafeService iSafeService, Context context) {
        int i11 = a.$EnumSwitchMapping$0[kycBindType.ordinal()];
        if (i11 == 1) {
            iSafeService.m56318l(context);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iSafeService.m56316j(context);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final KycBindProtocolResult m36862c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m36860a(context, KycBindType.EMAIL);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final KycBindProtocolResult m36863d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m36860a(context, KycBindType.PHONE);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m36864e(KycBindType kycBindType) {
        int i11 = a.$EnumSwitchMapping$0[kycBindType.ordinal()];
        if (i11 == 1) {
            return UserInfo.c().isEmailValidate();
        }
        if (i11 == 2) {
            return UserInfo.c().isPhoneValidate();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final KycBindProtocolResult m36860a(Context context, KycBindType kycBindType) {
        if (m36864e(kycBindType)) {
            return KycBindProtocolResult.f31247c.success();
        }
        try {
            m36861b(kycBindType, ISafeService.f46324a.get(), context);
            return KycBindProtocolResult.f31247c.success();
        } catch (Exception e11) {
            C44128b.m97262f("KycBindProtocolHandler", kycBindType.getMethodName() + " failed", e11);
            KycBindProtocolResult.Companion companion = KycBindProtocolResult.f31247c;
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            return companion.failed(message);
        }
    }
}
