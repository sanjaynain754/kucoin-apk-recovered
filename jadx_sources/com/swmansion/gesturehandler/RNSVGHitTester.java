package com.swmansion.gesturehandler;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.VirtualView;
import com.swmansion.gesturehandler.RNSVGHitTester;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: RNSVGHitTester.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/swmansion/gesturehandler/RNSVGHitTester;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RNSVGHitTester {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: RNSVGHitTester.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/swmansion/gesturehandler/RNSVGHitTester$Companion;", "", "<init>", "()V", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", "isSvgElement", "(Ljava/lang/Object;)Z", "Landroid/view/View;", "", "posX", "posY", "hitTest", "(Landroid/view/View;FF)Z", "Lcom/horcrux/svg/SvgView;", "b", "(Landroid/view/View;)Lcom/horcrux/svg/SvgView;", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: c */
        public static final int m71703c(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }

        /* JADX INFO: renamed from: b */
        public final SvgView m71704b(View view) {
            SvgView svgView;
            if (view instanceof VirtualView) {
                svgView = ((VirtualView) view).getSvgView();
                Intrinsics.checkNotNull(svgView);
            } else {
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.horcrux.svg.SvgView");
                svgView = (SvgView) view;
            }
            while (true) {
                ViewParent parent = svgView.getParent();
                Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                if (!isSvgElement(parent)) {
                    return svgView;
                }
                if (svgView.getParent() instanceof VirtualView) {
                    ViewParent parent2 = svgView.getParent();
                    Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type com.horcrux.svg.VirtualView");
                    svgView = ((VirtualView) parent2).getSvgView();
                    Intrinsics.checkNotNull(svgView);
                } else {
                    ViewParent parent3 = svgView.getParent();
                    Intrinsics.checkNotNull(parent3, "null cannot be cast to non-null type com.horcrux.svg.SvgView");
                    svgView = (SvgView) parent3;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0057  */
        public final boolean hitTest(@NotNull View view, float posX, float posY) {
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(view, "view");
            SvgView svgViewM71704b = m71704b(view);
            int[] iArr = {0, 0};
            int[] iArr2 = {0, 0};
            view.getLocationOnScreen(iArr);
            svgViewM71704b.getLocationOnScreen(iArr2);
            int iReactTagForTouch = svgViewM71704b.reactTagForTouch((iArr[0] + posX) - iArr2[0], (iArr[1] + posY) - iArr2[1]);
            if (view.getId() == iReactTagForTouch) {
                z11 = true;
            } else {
                z11 = false;
            }
            double width = view.getWidth();
            double d11 = posX;
            if (0.0d <= d11 && d11 <= width) {
                double height = view.getHeight();
                double d12 = posY;
                if (0.0d <= d12 && d12 <= height) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            if (view instanceof SvgView) {
                boolean zContains = SequencesKt.contains(SequencesKt.map(ViewGroupKt.getChildren((ViewGroup) view), new Function1() { // from class: qb0.f
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(RNSVGHitTester.Companion.m71703c((View) obj));
                    }
                }), Integer.valueOf(iReactTagForTouch));
                if ((!z11 && !zContains) || !z12) {
                    return false;
                }
                return true;
            }
            if (!z11 || !z12) {
                return false;
            }
            return true;
        }

        public final boolean isSvgElement(@NotNull Object view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (!(view instanceof VirtualView) && !(view instanceof SvgView)) {
                return false;
            }
            return true;
        }
    }
}
