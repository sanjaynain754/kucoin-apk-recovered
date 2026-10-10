package com.kubi.kyc.data;

import cn.InterfaceC5014a;
import kotlinx.coroutines.C41686h;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycPrecheckRepository.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kyc/data/KycPrecheckRepository;", "", "remoteService", "Lcom/kubi/kyc/data/source/KycRemoteService;", "<init>", "(Lcom/kubi/kyc/data/source/KycRemoteService;)V", "loadPrecheckData", "Lcom/kubi/kyc/data/KycPrecheckData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KycPrecheckRepository {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f31211b = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy<KycPrecheckRepository> f31212c = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.data.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KycPrecheckRepository.m36780d();
        }
    });

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC5014a f31213a;

    /* JADX INFO: compiled from: KycPrecheckRepository.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kyc/data/KycPrecheckRepository$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/kyc/data/KycPrecheckRepository;", "getInstance", "()Lcom/kubi/kyc/data/KycPrecheckRepository;", "instance$delegate", "Lkotlin/Lazy;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KycPrecheckRepository getInstance() {
            return (KycPrecheckRepository) KycPrecheckRepository.f31212c.getValue();
        }
    }

    public KycPrecheckRepository(@NotNull InterfaceC5014a remoteService) {
        Intrinsics.checkNotNullParameter(remoteService, "remoteService");
        this.f31213a = remoteService;
    }

    /* JADX INFO: renamed from: d */
    public static final KycPrecheckRepository m36780d() {
        InterfaceC5014a interfaceC5014a = (InterfaceC5014a) C42597a.m93388d().create(InterfaceC5014a.class);
        Intrinsics.checkNotNull(interfaceC5014a);
        return new KycPrecheckRepository(interfaceC5014a);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m36781e(@NotNull Continuation<? super KycPrecheckData> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KycPrecheckRepository$loadPrecheckData$2(this, null), continuation);
    }
}
