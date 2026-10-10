package com.kubi.assets;

import android.annotation.SuppressLint;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.user.config.UserInfo;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.g0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetTotalNotifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\b\u0010\u000b\u001a\u00020\tH\u0002J\u001c\u0010\f\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0\bJ\u001c\u0010\u000e\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/AssetTotalNotifier;", "", "<init>", "()V", "assetCache", "Ljava/math/BigDecimal;", "listeners", "", "Lkotlin/Function1;", "", "getBalance", "clearCache", "registerListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregisterListener", "notifyDataChange", "newData", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nAssetTotalNotifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetTotalNotifier.kt\ncom/kubi/assets/AssetTotalNotifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1869#2,2:50\n*S KotlinDebug\n*F\n+ 1 AssetTotalNotifier.kt\ncom/kubi/assets/AssetTotalNotifier\n*L\n47#1:50,2\n*E\n"})
public final class AssetTotalNotifier {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetTotalNotifier f17602a = new AssetTotalNotifier();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static BigDecimal f17603b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<Function1<BigDecimal, Unit>> f17604c;

    /* JADX INFO: renamed from: e */
    public final void m17041e() {
        f17603b = null;
    }

    static {
        Observable observableE = UserInfo.a.e();
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetTotalNotifier.m17039c((Boolean) obj);
            }
        };
        observableE.subscribe(new Consumer() { // from class: com.kubi.assets.f0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetTotalNotifier.m17040d(function1, obj);
            }
        });
        f17604c = new ArrayList();
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final BigDecimal m17042f() {
        return f17603b;
    }

    /* JADX INFO: renamed from: g */
    public final void m17043g(@Nullable BigDecimal bigDecimal) {
        f17603b = bigDecimal;
        Iterator<T> it = f17604c.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(bigDecimal);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m17044h(@NotNull Function1<? super BigDecimal, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<Function1<BigDecimal, Unit>> list = f17604c;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    /* JADX INFO: renamed from: i */
    public final void m17045i(@NotNull Function1<? super BigDecimal, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f17604c.remove(listener);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m17039c(Boolean bool) {
        if (!bool.booleanValue()) {
            f17602a.m17041e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final void m17040d(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
