package com.jumio.kotlin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\t\u001a{\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\n*\u00020\u0003\"\b\b\u0003\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\b\u0010\u000b\u001a\u0004\u0018\u0001H\n2 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u0095\u0001\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\n*\u00020\u0003\"\b\b\u0003\u0010\u000e*\u00020\u0003\"\b\b\u0004\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\b\u0010\u000b\u001a\u0004\u0018\u0001H\n2\b\u0010\u000f\u001a\u0004\u0018\u0001H\u000e2&\u0010\u0007\u001a\"\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000e\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, m90084d2 = {"safeLet", "R", "T1", "", "T2", "p1", "p2", "block", "Lkotlin/Function2;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "T3", "p3", "Lkotlin/Function3;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "T4", "p4", "Lkotlin/Function4;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KotlinExtensionsKt {
    @Nullable
    public static final <T1, T2, R> R safeLet(@Nullable T1 t11, @Nullable T2 t12, @NotNull Function2<? super T1, ? super T2, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (t11 == null || t12 == null) {
            return null;
        }
        return block.invoke(t11, t12);
    }

    @Nullable
    public static final <T1, T2, T3, R> R safeLet(@Nullable T1 t11, @Nullable T2 t12, @Nullable T3 t13, @NotNull Function3<? super T1, ? super T2, ? super T3, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (t11 == null || t12 == null || t13 == null) {
            return null;
        }
        return block.invoke(t11, t12, t13);
    }

    @Nullable
    public static final <T1, T2, T3, T4, R> R safeLet(@Nullable T1 t11, @Nullable T2 t12, @Nullable T3 t13, @Nullable T4 t14, @NotNull Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (t11 == null || t12 == null || t13 == null || t14 == null) {
            return null;
        }
        return block.invoke(t11, t12, t13, t14);
    }
}
