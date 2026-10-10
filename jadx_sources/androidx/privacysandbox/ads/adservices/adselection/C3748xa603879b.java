package androidx.privacysandbox.ads.adservices.adselection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 */
/* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", m90122f = "AdSelectionManagerImplCommon.kt", m90123i = {0, 0}, m90124l = {231}, m90125m = "getAdSelectionData", m90126n = {"adSelectionManager", "getAdSelectionDataRequest"}, m90127s = {"L$0", "L$1"})
public final class C3748xa603879b extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdSelectionManagerImplCommon.Ext10Impl.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3748xa603879b(AdSelectionManagerImplCommon.Ext10Impl.Companion companion, Continuation<? super C3748xa603879b> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAdSelectionData(null, null, this);
    }
}
