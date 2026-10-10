package com.kubi.kucoin.utils;

import android.content.Context;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AsyncBottomTabDrawable.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kucoin/utils/DefaultBottomLottieGateway;", "Lcom/kubi/kucoin/utils/BottomLottieGateway;", "<init>", "()V", "requestComposition", "Lcom/kubi/kucoin/utils/BottomLottieRequest;", "context", "Landroid/content/Context;", "assetName", "", "onSuccess", "Lkotlin/Function2;", "Lcom/airbnb/lottie/LottieComposition;", "Lcom/kubi/kucoin/utils/BottomLottieSource;", "", "onFailure", "Lkotlin/Function1;", "", "createDrawable", "Lcom/airbnb/lottie/LottieDrawable;", "composition", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultBottomLottieGateway implements BottomLottieGateway {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DefaultBottomLottieGateway f28597a = new DefaultBottomLottieGateway();

    @Override // com.kubi.kucoin.utils.BottomLottieGateway
    @NotNull
    /* JADX INFO: renamed from: a */
    public LottieDrawable mo33150a(@NotNull C5080h composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        return BottomMenuHelper.f28520a.m33064g(composition);
    }

    @Override // com.kubi.kucoin.utils.BottomLottieGateway
    @NotNull
    /* JADX INFO: renamed from: b */
    public BottomLottieRequest mo33151b(@NotNull Context context, @NotNull String assetName, @NotNull Function2<? super C5080h, ? super BottomLottieSource, Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        return BottomMenuHelper.f28520a.m33072o(context, assetName, onSuccess, onFailure);
    }
}
