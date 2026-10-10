package com.kubi.resources.shimmer;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.resources.shimmer.mask.SkeletonShimmerDirection;
import com.kubi.sdk.res.R$color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p213dw.C36985a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.properties.Delegates;
import p852kotlin.properties.ObservableProperty;
import p852kotlin.properties.ReadWriteProperty;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: SkeletonConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 62\u00020\u0001:\u00016B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\b\u0010.\u001a\u00020-H\u0002J\u0014\u0010/\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,J)\u00100\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u0002H301\"\u0004\b\u0000\u001032\u0006\u00104\u001a\u0002H3H\u0002¢\u0006\u0002\u00105R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038W@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038W@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R+\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0014\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0014\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010\u0012R\u001a\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0+X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m90084d2 = {"Lcom/kubi/resources/shimmer/SkeletonConfig;", "Lcom/kubi/resources/shimmer/SkeletonStyle;", "maskColor", "", "maskCornerRadius", "", "shimmerColor", "shimmerDurationInMillis", "", "shimmerDirection", "Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;", "shimmerAngle", "<init>", "(IFIJLcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;I)V", "<set-?>", "getMaskColor", "()I", "setMaskColor", "(I)V", "maskColor$delegate", "Lkotlin/properties/ReadWriteProperty;", "getMaskCornerRadius", "()F", "setMaskCornerRadius", "(F)V", "maskCornerRadius$delegate", "getShimmerColor", "setShimmerColor", "shimmerColor$delegate", "getShimmerDurationInMillis", "()J", "setShimmerDurationInMillis", "(J)V", "shimmerDurationInMillis$delegate", "getShimmerDirection", "()Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;", "setShimmerDirection", "(Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;)V", "shimmerDirection$delegate", "getShimmerAngle", "setShimmerAngle", "shimmerAngle$delegate", "valueObservers", "", "Lkotlin/Function0;", "", "onValueChanged", "addValueObserver", "observable", "Lkotlin/properties/ReadWriteProperty;", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "(Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSkeletonConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkeletonConfig.kt\ncom/kubi/resources/shimmer/SkeletonConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,77:1\n1869#2,2:78\n33#3,3:80\n*S KotlinDebug\n*F\n+ 1 SkeletonConfig.kt\ncom/kubi/resources/shimmer/SkeletonConfig\n*L\n54#1:78,2\n62#1:80,3\n*E\n"})
public final class SkeletonConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ReadWriteProperty f43682a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ReadWriteProperty f43683b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ReadWriteProperty f43684c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ReadWriteProperty f43685d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final ReadWriteProperty f43686e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final ReadWriteProperty f43687f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<Function0<Unit>> f43688g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f43681i = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SkeletonConfig.class, "maskColor", "getMaskColor()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SkeletonConfig.class, "maskCornerRadius", "getMaskCornerRadius()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SkeletonConfig.class, "shimmerColor", "getShimmerColor()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SkeletonConfig.class, "shimmerDurationInMillis", "getShimmerDurationInMillis()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SkeletonConfig.class, "shimmerDirection", "getShimmerDirection()Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SkeletonConfig.class, "shimmerAngle", "getShimmerAngle()I", 0))};

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Companion f43680h = new Companion(null);

    /* JADX INFO: compiled from: SkeletonConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/resources/shimmer/SkeletonConfig$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/resources/shimmer/SkeletonConfig;", "context", "Landroid/content/Context;", "maskCornerRadius", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ SkeletonConfig create$default(Companion companion, Context context, float f11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f11 = C36985a.m82803a(4.0f, context);
            }
            return companion.create(context, f11);
        }

        @NotNull
        public final SkeletonConfig create(@NotNull Context context, float maskCornerRadius) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new SkeletonConfig(ContextCompat.getColor(context, R$color.c_shimmer_mask), maskCornerRadius, ContextCompat.getColor(context, R$color.c_shimmer_splash), 1200L, SkeletonShimmerDirection.LEFT_TO_RIGHT, 0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.kubi.resources.shimmer.SkeletonConfig$a */
    /* JADX INFO: compiled from: Delegates.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 SkeletonConfig.kt\ncom/kubi/resources/shimmer/SkeletonConfig\n*L\n1#1,73:1\n62#2:74\n*E\n"})
    public static final class C22909a<T> extends ObservableProperty<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SkeletonConfig f43689a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22909a(Object obj, SkeletonConfig skeletonConfig) {
            super(obj);
            this.f43689a = skeletonConfig;
        }

        @Override // p852kotlin.properties.ObservableProperty
        public void afterChange(KProperty<?> property, T oldValue, T newValue) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f43689a.m54385j();
        }
    }

    public SkeletonConfig(@ColorInt int i11, float f11, @ColorInt int i12, long j11, @NotNull SkeletonShimmerDirection shimmerDirection, int i13) {
        Intrinsics.checkNotNullParameter(shimmerDirection, "shimmerDirection");
        this.f43682a = m54384i(Integer.valueOf(i11));
        this.f43683b = m54384i(Float.valueOf(f11));
        this.f43684c = m54384i(Integer.valueOf(i12));
        this.f43685d = m54384i(Long.valueOf(j11));
        this.f43686e = m54384i(shimmerDirection);
        this.f43687f = m54384i(Integer.valueOf(i13));
        this.f43688g = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public final void m54377b(@NotNull Function0<Unit> onValueChanged) {
        Intrinsics.checkNotNullParameter(onValueChanged, "onValueChanged");
        this.f43688g.add(onValueChanged);
    }

    @ColorInt
    /* JADX INFO: renamed from: c */
    public int m54378c() {
        return ((Number) this.f43682a.getValue(this, f43681i[0])).intValue();
    }

    /* JADX INFO: renamed from: d */
    public float m54379d() {
        return ((Number) this.f43683b.getValue(this, f43681i[1])).floatValue();
    }

    /* JADX INFO: renamed from: e */
    public int m54380e() {
        return ((Number) this.f43687f.getValue(this, f43681i[5])).intValue();
    }

    @ColorInt
    /* JADX INFO: renamed from: f */
    public int m54381f() {
        return ((Number) this.f43684c.getValue(this, f43681i[2])).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public SkeletonShimmerDirection m54382g() {
        return (SkeletonShimmerDirection) this.f43686e.getValue(this, f43681i[4]);
    }

    /* JADX INFO: renamed from: h */
    public long m54383h() {
        return ((Number) this.f43685d.getValue(this, f43681i[3])).longValue();
    }

    /* JADX INFO: renamed from: i */
    public final <T> ReadWriteProperty<Object, T> m54384i(T t11) {
        Delegates delegates = Delegates.INSTANCE;
        return new C22909a(t11, this);
    }

    /* JADX INFO: renamed from: j */
    public final void m54385j() {
        Iterator<T> it = this.f43688g.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m54386k(int i11) {
        this.f43682a.setValue(this, f43681i[0], Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: l */
    public void m54387l(float f11) {
        this.f43683b.setValue(this, f43681i[1], Float.valueOf(f11));
    }

    /* JADX INFO: renamed from: m */
    public void m54388m(int i11) {
        this.f43687f.setValue(this, f43681i[5], Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: n */
    public void m54389n(int i11) {
        this.f43684c.setValue(this, f43681i[2], Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: o */
    public void m54390o(@NotNull SkeletonShimmerDirection skeletonShimmerDirection) {
        Intrinsics.checkNotNullParameter(skeletonShimmerDirection, "<set-?>");
        this.f43686e.setValue(this, f43681i[4], skeletonShimmerDirection);
    }

    /* JADX INFO: renamed from: p */
    public void m54391p(long j11) {
        this.f43685d.setValue(this, f43681i[3], Long.valueOf(j11));
    }
}
