package androidx.savedstate;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SavedState.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000\u001a7\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\n\u0010\u0004\u001a\u00060\u0001j\u0002`\u00032\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000*\n\u0010\u0000\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, m90084d2 = {"SavedState", "Landroid/os/Bundle;", "savedState", "Landroidx/savedstate/SavedState;", "initialState", "", "", "", "builderAction", "Lkotlin/Function1;", "Landroidx/savedstate/SavedStateWriter;", "", "Lkotlin/ExtensionFunctionType;", "savedstate_release"}, m90085k = 5, m90086mv = {2, 0, 0}, m90088xi = 48, m90089xs = "androidx/savedstate/SavedStateKt")
@SourceDebugExtension({"SMAP\nSavedState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,46:1\n126#2:47\n153#2,3:48\n37#3,2:51\n1#4:53\n106#5:54\n106#5:55\n*S KotlinDebug\n*F\n+ 1 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n*L\n35#1:47\n35#1:48,3\n35#1:51,2\n37#1:54\n44#1:55\n*E\n"})
final /* synthetic */ class SavedStateKt__SavedState_androidKt {
    @NotNull
    public static final Bundle savedState(@NotNull Map<String, ? extends Object> initialState, @NotNull Function1<? super SavedStateWriter, Unit> builderAction) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (initialState.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(initialState.size());
            for (Map.Entry<String, ? extends Object> entry : initialState.entrySet()) {
                arrayList.add(TuplesKt.m90091to(entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        builderAction.invoke(SavedStateWriter.m103673boximpl(SavedStateWriter.m103675constructorimpl(bundleBundleOf)));
        return bundleBundleOf;
    }

    public static /* synthetic */ Bundle savedState$default(Bundle initialState, Function1 builderAction, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            builderAction = new Function1<SavedStateWriter, Unit>() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt.savedState.3
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SavedStateWriter savedStateWriter) {
                    m103587invokexApjlu4(savedStateWriter.getSource());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m103587invokexApjlu4(Bundle bundle) {
                    Intrinsics.checkNotNullParameter(bundle, "<this>");
                }
            };
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Bundle bundle = new Bundle(initialState);
        builderAction.invoke(SavedStateWriter.m103673boximpl(SavedStateWriter.m103675constructorimpl(bundle)));
        return bundle;
    }

    public static /* synthetic */ Bundle savedState$default(Map initialState, Function1 builderAction, int i11, Object obj) {
        Pair[] pairArr;
        if ((i11 & 1) != 0) {
            initialState = MapsKt.emptyMap();
        }
        if ((i11 & 2) != 0) {
            builderAction = new Function1<SavedStateWriter, Unit>() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt.savedState.1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SavedStateWriter savedStateWriter) {
                    m103586invokexApjlu4(savedStateWriter.getSource());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m103586invokexApjlu4(Bundle bundle) {
                    Intrinsics.checkNotNullParameter(bundle, "<this>");
                }
            };
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (initialState.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(initialState.size());
            for (Map.Entry entry : initialState.entrySet()) {
                arrayList.add(TuplesKt.m90091to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        builderAction.invoke(SavedStateWriter.m103673boximpl(SavedStateWriter.m103675constructorimpl(bundleBundleOf)));
        return bundleBundleOf;
    }

    @NotNull
    public static final Bundle savedState(@NotNull Bundle initialState, @NotNull Function1<? super SavedStateWriter, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Bundle bundle = new Bundle(initialState);
        builderAction.invoke(SavedStateWriter.m103673boximpl(SavedStateWriter.m103675constructorimpl(bundle)));
        return bundle;
    }
}
