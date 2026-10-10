package com.kubi.sdk.pkg.bundle;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BundleManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
public /* synthetic */ class BundleManager$startUpdateAll$3$cloudBatches$1 extends FunctionReferenceImpl implements Function1<String, String> {
    public static final BundleManager$startUpdateAll$3$cloudBatches$1 INSTANCE = new BundleManager$startUpdateAll$3$cloudBatches$1();

    public BundleManager$startUpdateAll$3$cloudBatches$1() {
        super(1, C23935a.class, "parseBiz", "parseBiz(Ljava/lang/String;)Ljava/lang/String;", 1);
    }

    @Override // p852kotlin.jvm.functions.Function1
    @Nullable
    public final String invoke(@NotNull String p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return C23935a.m57545b(p11);
    }
}
