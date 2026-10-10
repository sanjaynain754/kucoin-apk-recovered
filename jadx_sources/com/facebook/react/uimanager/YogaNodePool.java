package com.facebook.react.uimanager;

import com.facebook.react.common.ClearableSynchronizedPool;
import com.facebook.yoga.AbstractC6262a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: YogaNodePool.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\f"}, m90084d2 = {"Lcom/facebook/react/uimanager/YogaNodePool;", "", "<init>", "()V", "Lcom/facebook/react/common/ClearableSynchronizedPool;", "Lcom/facebook/yoga/a;", "get", "()Lcom/facebook/react/common/ClearableSynchronizedPool;", "pool$delegate", "Lkotlin/Lazy;", "getPool", "pool", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class YogaNodePool {

    @NotNull
    public static final YogaNodePool INSTANCE = new YogaNodePool();

    /* JADX INFO: renamed from: pool$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy pool = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.facebook.react.uimanager.p0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return YogaNodePool.pool_delegate$lambda$0();
        }
    });

    @JvmStatic
    @NotNull
    public static final ClearableSynchronizedPool<AbstractC6262a> get() {
        return INSTANCE.getPool();
    }

    private final ClearableSynchronizedPool<AbstractC6262a> getPool() {
        return (ClearableSynchronizedPool) pool.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearableSynchronizedPool pool_delegate$lambda$0() {
        return new ClearableSynchronizedPool(1024);
    }

    private YogaNodePool() {
    }
}
