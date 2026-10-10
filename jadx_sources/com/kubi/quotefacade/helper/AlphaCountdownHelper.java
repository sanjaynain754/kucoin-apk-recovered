package com.kubi.quotefacade.helper;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.C27100x0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AlphaCountdownHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010J\u0006\u0010\u0012\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/AlphaCountdownHelper;", "", "<init>", "()V", "TAG", "", "countdownJob", "Lkotlinx/coroutines/Job;", "launchCountdown", "", "scope", "Landroidx/lifecycle/LifecycleCoroutineScope;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "onRefresh", "Lkotlin/Function1;", "", "cancelCountdown", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaCountdownHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaCountdownHelper.kt\ncom/kubi/quotefacade/helper/AlphaCountdownHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n774#2:63\n865#2,2:64\n1#3:66\n*S KotlinDebug\n*F\n+ 1 AlphaCountdownHelper.kt\ncom/kubi/quotefacade/helper/AlphaCountdownHelper\n*L\n32#1:63\n32#1:64,2\n*E\n"})
public final class AlphaCountdownHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AlphaCountdownHelper f41948a = new AlphaCountdownHelper();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static InterfaceC41775x1 f41949b;

    /* JADX INFO: renamed from: c */
    public static final Unit m51883c() {
        InterfaceC41775x1 interfaceC41775x1 = f41949b;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m51884b() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.helper.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaCountdownHelper.m51883c();
            }
        });
    }
}
