package com.kubi.p072ad.service;

import com.kubi.sdk.BaseActivity;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.ad.service.k */
/* JADX INFO: compiled from: ProtocolGuide.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0080@¢\u0006\u0002\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"AGREE_PROTOCOL", "", "checkGuide", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "(Lcom/kubi/sdk/BaseActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AdLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C9336k {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m14697b(@NotNull BaseActivity baseActivity, @NotNull Continuation<? super Boolean> continuation) {
        final InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
        new ProtocolGuide(baseActivity, new Function1() { // from class: com.kubi.ad.service.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9336k.m14698c(interfaceC41769wM91388c, ((Boolean) obj).booleanValue());
            }
        }).m14672j();
        return interfaceC41769wM91388c.mo91198h(continuation);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m14698c(InterfaceC41769w interfaceC41769w, boolean z11) {
        interfaceC41769w.mo91370n(Boolean.valueOf(z11));
        return Unit.INSTANCE;
    }
}
