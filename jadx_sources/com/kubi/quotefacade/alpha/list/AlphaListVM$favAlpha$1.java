package com.kubi.quotefacade.alpha.list;

import com.facebook.react.uimanager.ViewProps;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AlphaListVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.alpha.list.AlphaListVM", m90122f = "AlphaListVM.kt", m90123i = {0, 0}, m90124l = {TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_PROGRESSIVE_DCT}, m90125m = "favAlpha", m90126n = {"alphaItem", ViewProps.POSITION}, m90127s = {"L$0", "I$0"})
public final class AlphaListVM$favAlpha$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AlphaListVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaListVM$favAlpha$1(AlphaListVM alphaListVM, Continuation<? super AlphaListVM$favAlpha$1> continuation) {
        super(continuation);
        this.this$0 = alphaListVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m50654j(null, 0, this);
    }
}
