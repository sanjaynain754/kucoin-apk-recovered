package androidx.datastore.core;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.contracts.ExperimentalContracts;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.Intrinsics;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: MutexUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aJ\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0081\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m90084d2 = {"R", "Lrg0/a;", "", TUIConstants.TUIChat.OWNER, "Lkotlin/Function1;", "", "block", "withTryLock", "(Lrg0/a;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "datastore-core_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class MutexUtilsKt {
    public static /* synthetic */ Object withTryLock$default(InterfaceC44082a interfaceC44082a, Object obj, Function1 block, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        Intrinsics.checkNotNullParameter(interfaceC44082a, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zMo91342a = interfaceC44082a.mo91342a(obj);
        try {
            return block.invoke(Boolean.valueOf(zMo91342a));
        } finally {
            InlineMarker.finallyStart(1);
            if (zMo91342a) {
                interfaceC44082a.mo91345e(obj);
            }
            InlineMarker.finallyEnd(1);
        }
    }

    @ExperimentalContracts
    public static final <R> R withTryLock(@NotNull InterfaceC44082a interfaceC44082a, @Nullable Object obj, @NotNull Function1<? super Boolean, ? extends R> block) {
        Intrinsics.checkNotNullParameter(interfaceC44082a, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zMo91342a = interfaceC44082a.mo91342a(obj);
        try {
            return block.invoke(Boolean.valueOf(zMo91342a));
        } finally {
            InlineMarker.finallyStart(1);
            if (zMo91342a) {
                interfaceC44082a.mo91345e(obj);
            }
            InlineMarker.finallyEnd(1);
        }
    }
}
