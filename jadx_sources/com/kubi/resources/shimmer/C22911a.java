package com.kubi.resources.shimmer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.kubi.monitor.utils.DeviceLevel;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import cr.C36522b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p213dw.C36985a;
import p213dw.InterfaceC36986b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.resources.shimmer.a */
/* JADX INFO: compiled from: SkeletonExtensions.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f*\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0006\u0010\u000f\u001a\u00020\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"TAG_SHIMMER", "", "createSkeletonRadius", "Lcom/kubi/resources/shimmer/Skeleton;", "Landroid/view/View;", "cornerRadius", "", "(Landroid/view/View;Ljava/lang/Float;)Lcom/kubi/resources/shimmer/Skeleton;", "createSkeleton", "config", "Lcom/kubi/resources/shimmer/SkeletonConfig;", "batchSkeletons", "", TIMPushProvider.f75062n, "", "enableSkeletonAnimation", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "SkeletonLayoutUtils")
@SourceDebugExtension({"SMAP\nSkeletonExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkeletonExtensions.kt\ncom/kubi/resources/shimmer/SkeletonLayoutUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1617#2,9:74\n1869#2:83\n1870#2:86\n1626#2:87\n1#3:84\n1#3:85\n*S KotlinDebug\n*F\n+ 1 SkeletonExtensions.kt\ncom/kubi/resources/shimmer/SkeletonLayoutUtils\n*L\n57#1:74,9\n57#1:83\n57#1:86\n57#1:87\n57#1:85\n*E\n"})
public final class C22911a {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m54397b(List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return m54396a(list, z11);
    }

    /* JADX INFO: renamed from: com.kubi.resources.shimmer.a$a */
    /* JADX INFO: compiled from: SkeletonExtensions.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceLevel.values().length];
            try {
                iArr[DeviceLevel.BEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceLevel.HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final List<InterfaceC36986b> m54396a(@NotNull List<? extends View> list, boolean z11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!m54401f()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC36986b interfaceC36986bM54399d = m54399d((View) it.next(), null, 1, null);
            if (interfaceC36986bM54399d == null) {
                interfaceC36986bM54399d = null;
            } else if (z11) {
                interfaceC36986bM54399d.mo54393a();
            }
            if (interfaceC36986bM54399d != null) {
                arrayList.add(interfaceC36986bM54399d);
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final InterfaceC36986b m54398c(@NotNull View view, @NotNull SkeletonConfig config) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!m54401f()) {
            return null;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        int iIndexOfChild = viewGroup != null ? viewGroup.indexOfChild(view) : 0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        SkeletonLayout skeletonLayout = new SkeletonLayout(view, config);
        if (layoutParams != null) {
            skeletonLayout.setLayoutParams(layoutParams);
        }
        if (viewGroup != null) {
            viewGroup.addView(skeletonLayout, iIndexOfChild);
        }
        return skeletonLayout;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC36986b m54399d(View view, SkeletonConfig skeletonConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            SkeletonConfig.Companion companion = SkeletonConfig.f43680h;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            skeletonConfig = SkeletonConfig.Companion.create$default(companion, context, 0.0f, 2, null);
        }
        return m54398c(view, skeletonConfig);
    }

    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final InterfaceC36986b m54400e(@NotNull View view, @Nullable Float f11) {
        SkeletonConfig skeletonConfigCreate$default;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!m54401f()) {
            return null;
        }
        if (f11 != null) {
            SkeletonConfig.Companion companion = SkeletonConfig.f43680h;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float fFloatValue = f11.floatValue();
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            skeletonConfigCreate$default = companion.create(context, C36985a.m82803a(fFloatValue, context2));
        } else {
            SkeletonConfig.Companion companion2 = SkeletonConfig.f43680h;
            Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            skeletonConfigCreate$default = SkeletonConfig.Companion.create$default(companion2, context3, 0.0f, 2, null);
        }
        return m54398c(view, skeletonConfigCreate$default);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m54401f() {
        int i11 = a.$EnumSwitchMapping$0[C36522b.f79371a.m81777g().ordinal()];
        return i11 == 1 || i11 == 2;
    }
}
