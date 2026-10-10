package com.kubi.futures.view;

import androidx.lifecycle.LifecycleCoroutineScope;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycLeadView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/view/KycLeadHelper;", "", "<init>", "()V", "checkKycLead", "", "leadView", "Lcom/kubi/futures/view/KycLeadView;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KycLeadHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KycLeadHelper f25001a = new KycLeadHelper();

    /* JADX INFO: renamed from: a */
    public final void m28852a(@Nullable KycLeadView kycLeadView, @NotNull LifecycleCoroutineScope lifecycleScope) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        if (kycLeadView != null) {
            C41696j.m91104d(lifecycleScope, C42911a.m94120b(), null, new KycLeadHelper$checkKycLead$1$1(kycLeadView, null), 2, null);
        }
    }
}
