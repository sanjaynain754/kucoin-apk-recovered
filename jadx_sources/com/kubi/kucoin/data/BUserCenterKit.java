package com.kubi.kucoin.data;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.kucoin.data.platform.IPlatformService;
import com.kubi.kucoin.data.platform.PlatformServiceImpl;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kucoin.data.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BUserCenterKit.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001f\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\b¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R?\u0010\u0006\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00010\u0007j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u0001`\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kucoin/data/BUserCenterKit;", "", "<init>", "()V", "TAG", "", "services", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lkotlin/collections/HashMap;", "getServices", "()Ljava/util/HashMap;", "services$delegate", "Lkotlin/Lazy;", "init", "", "context", "Landroid/content/Context;", "getService", ExifInterface.GPS_DIRECTION_TRUE, "key", "(Ljava/lang/Class;)Ljava/lang/Object;", "registerService", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBUserCenterKit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BUserCenterKit.kt\ncom/kubi/kucoin/data/BUserCenterKit\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n808#2,11:56\n1869#2,2:67\n*S KotlinDebug\n*F\n+ 1 BUserCenterKit.kt\ncom/kubi/kucoin/data/BUserCenterKit\n*L\n39#1:56,11\n39#1:67,2\n*E\n"})
public final class BUserCenterKit {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BUserCenterKit f27728a = new BUserCenterKit();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f27729b = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.data.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BUserCenterKit.m31967h();
        }
    });

    /* JADX INFO: renamed from: h */
    public static final HashMap m31967h() {
        return MapsKt.hashMapOf(TuplesKt.m90091to(IPlatformService.class, new PlatformServiceImpl()));
    }

    /* JADX INFO: renamed from: c */
    public final <T> T m31968c(@NotNull Class<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) m31969d().get(key);
    }

    /* JADX INFO: renamed from: d */
    public final HashMap<Class<?>, Object> m31969d() {
        return (HashMap) f27729b.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m31970e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m31971f();
    }

    /* JADX INFO: renamed from: g */
    public static final void m31966g(IInternal iInternal) {
        iInternal.init();
    }

    /* JADX INFO: renamed from: f */
    public final void m31971f() {
        Collection<Object> collectionValues = m31969d().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        ArrayList<IInternal> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof IInternal) {
                arrayList.add(obj);
            }
        }
        for (final IInternal iInternal : arrayList) {
            Schedulers.m87969io().scheduleDirect(new Runnable() { // from class: com.kubi.kucoin.data.e
                @Override // java.lang.Runnable
                public final void run() {
                    BUserCenterKit.m31966g(iInternal);
                }
            });
        }
    }
}
