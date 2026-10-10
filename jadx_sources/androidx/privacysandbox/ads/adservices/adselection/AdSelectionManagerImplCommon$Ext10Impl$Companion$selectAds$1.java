package androidx.privacysandbox.ads.adservices.adselection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", m90122f = "AdSelectionManagerImplCommon.kt", m90123i = {0, 0}, m90124l = {231}, m90125m = "selectAds", m90126n = {"adSelectionManager", "adSelectionFromOutcomesConfig"}, m90127s = {"L$0", "L$1"})
public final class AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdSelectionManagerImplCommon.Ext10Impl.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(AdSelectionManagerImplCommon.Ext10Impl.Companion companion, Continuation<? super AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.selectAds(null, null, this);
    }
}
