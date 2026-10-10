package com.kubi.futures.dialog.position;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.messaging.Constants;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.futures.dialog.MarkPriceGuideDialog;
import com.kubi.futures.dialog.position.LiqDescDialog;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import dm.C36770h0;
import f00.C37304a;
import fm.C37567b;
import fm.C37569d;
import g00.InterfaceC37766r;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Iterator;
import java.util.List;
import nf.C42828b;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p729wl.C45875l0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LiqDescDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 32\u00020\u0001:\u000234B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\u0014\u0010!\u001a\u00020\u0019*\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\b\u0010'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+H\u0002J\u001c\u0010)\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010$2\b\u0010-\u001a\u0004\u0018\u00010$H\u0002J\u0014\u0010.\u001a\u00020/*\u00020+2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u00100\u001a\u00020$*\u0004\u0018\u00010$2\b\u00101\u001a\u0004\u0018\u000102H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u00065"}, m90084d2 = {"Lcom/kubi/futures/dialog/position/LiqDescDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogLiqPriceDescBinding;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/futures/dialog/position/LiqDescParams;", "getParams", "()Lcom/kubi/futures/dialog/position/LiqDescParams;", "params$delegate", "Lkotlin/Lazy;", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onStart", "onDestroyView", "setupPriceRows", "setupPriceValueAlignment", "setupDesc", "setupLinkTexts", "setTextWithArrow", "Landroid/widget/TextView;", Constants.ScionAnalytics.PARAM_LABEL, "", "limitDialogHeight", "setupActions", "dismissRelatedDialogs", "observePositionIfNeeded", "updatePriceRows", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "markPriceText", "liquidationPriceText", "matches", "", "appendPriceCurrency", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "Companion", "LinkArrowSpan", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiqDescDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiqDescDialog.kt\ncom/kubi/futures/dialog/position/LiqDescDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1869#2,2:371\n1869#2,2:373\n295#2,2:379\n326#3,4:375\n1#4:381\n*S KotlinDebug\n*F\n+ 1 LiqDescDialog.kt\ncom/kubi/futures/dialog/position/LiqDescDialog\n*L\n132#1:371,2\n285#1:373,2\n299#1:379,2\n259#1:375,4\n*E\n"})
public final class LiqDescDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final Companion f22881t0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    public C36770h0 f22882q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final CompositeDisposable f22883r0 = new CompositeDisposable();

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f22884s0 = LazyKt.lazy(new Function0() { // from class: yh.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiqDescDialog.m25315C4(this.f104254b);
        }
    });

    /* JADX INFO: compiled from: LiqDescDialog.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/futures/dialog/position/LiqDescDialog$Companion;", "", "<init>", "()V", "TAG", "", "MAX_DIALOG_HEIGHT_RATIO", "", "newInstance", "Lcom/kubi/futures/dialog/position/LiqDescDialog;", "isCross", "", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/futures/dialog/position/LiqDescParams;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LiqDescDialog newInstance(boolean isCross) {
            return newInstance(new LiqDescParams(isCross, null, null, null, false, null, null, false, 254, null));
        }

        public Companion() {
        }

        @NotNull
        public final LiqDescDialog newInstance(@NotNull PositionEntity position) {
            Intrinsics.checkNotNullParameter(position, "position");
            return newInstance(LiqDescParams.INSTANCE.from(position));
        }

        @NotNull
        public final LiqDescDialog newInstance(@NotNull LiqDescParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            LiqDescDialog liqDescDialog = new LiqDescDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", params);
            liqDescDialog.setArguments(bundle);
            return liqDescDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.dialog.position.LiqDescDialog$a */
    /* JADX INFO: compiled from: LiqDescDialog.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016JP\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/futures/dialog/position/LiqDescDialog$LinkArrowSpan;", "Landroid/text/style/ImageSpan;", "drawable", "Landroid/graphics/drawable/Drawable;", "mirrored", "", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "getSize", "", "paint", "Landroid/graphics/Paint;", "text", "", "start", "end", "fontMetricsInt", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "", ViewProps.TOP, "y", ViewProps.BOTTOM, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13111a extends ImageSpan {

        /* JADX INFO: renamed from: b */
        public final boolean f22885b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13111a(@NotNull Drawable drawable, boolean z11) {
            super(drawable);
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            this.f22885b = z11;
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x11, int top, int y11, int bottom, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(paint, "paint");
            Drawable drawable = getDrawable();
            int iHeight = (top + ((bottom - top) / 2)) - (drawable.getBounds().height() / 2);
            canvas.save();
            if (this.f22885b) {
                canvas.translate(x11 + drawable.getBounds().width(), iHeight);
                canvas.scale(-1.0f, 1.0f);
            } else {
                canvas.translate(x11, iHeight);
            }
            drawable.draw(canvas);
            canvas.restore();
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            Intrinsics.checkNotNullParameter(paint, "paint");
            Intrinsics.checkNotNullParameter(text, "text");
            Rect bounds = getDrawable().getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            if (fontMetricsInt != null) {
                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                int i11 = fontMetricsInt2.descent;
                int i12 = fontMetricsInt2.ascent;
                int i13 = i12 + ((i11 - i12) / 2);
                int i14 = (bounds.bottom - bounds.top) / 2;
                int i15 = i13 - i14;
                fontMetricsInt.ascent = i15;
                fontMetricsInt.top = i15;
                int i16 = i13 + i14;
                fontMetricsInt.bottom = i16;
                fontMetricsInt.descent = i16;
            }
            return bounds.width();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m25327v4(LiqDescDialog liqDescDialog, int i11) {
        C36770h0 c36770h0 = liqDescDialog.f22882q0;
        C36770h0 c36770h1 = null;
        if (c36770h0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36770h0 = null;
        }
        View childAt = c36770h0.getRoot().getChildAt(0);
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i11 - (childAt != null ? childAt.getMeasuredHeight() : 0), 0);
        C36770h0 c36770h2 = liqDescDialog.f22882q0;
        if (c36770h2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36770h2 = null;
        }
        if (c36770h2.f80164c.getMeasuredHeight() > iCoerceAtLeast) {
            C36770h0 c36770h3 = liqDescDialog.f22882q0;
            if (c36770h3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c36770h1 = c36770h3;
            }
            ScrollView contentScrollView = c36770h1.f80164c;
            Intrinsics.checkNotNullExpressionValue(contentScrollView, "contentScrollView");
            ViewGroup.LayoutParams layoutParams = contentScrollView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = iCoerceAtLeast;
            contentScrollView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public final void m25331E4() {
        C36770h0 c36770h0 = this.f22882q0;
        C36770h0 c36770h1 = null;
        if (c36770h0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36770h0 = null;
        }
        LinearLayout learnMore = c36770h0.f80166e;
        Intrinsics.checkNotNullExpressionValue(learnMore, "learnMore");
        C27046k.m66711z(learnMore, 0L, new Function0() { // from class: yh.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiqDescDialog.m25316F4(this.f104258b);
            }
        }, 1, null);
        C36770h0 c36770h2 = this.f22882q0;
        if (c36770h2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36770h1 = c36770h2;
        }
        LinearLayout showMarkPriceGuide = c36770h1.f80171j;
        Intrinsics.checkNotNullExpressionValue(showMarkPriceGuide, "showMarkPriceGuide");
        C27046k.m66711z(showMarkPriceGuide, 0L, new Function0() { // from class: yh.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiqDescDialog.m25317G4(this.f104259b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: I4 */
    public final void m25333I4() {
        C36770h0 c36770h0 = this.f22882q0;
        C36770h0 c36770h1 = null;
        if (c36770h0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36770h0 = null;
        }
        BaseTextView learnMoreText = c36770h0.f80167f;
        Intrinsics.checkNotNullExpressionValue(learnMoreText, "learnMoreText");
        String string = getString(R$string.learn_more);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m25330D4(learnMoreText, string);
        C36770h0 c36770h2 = this.f22882q0;
        if (c36770h2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36770h1 = c36770h2;
        }
        BaseTextView showMarkPriceGuideText = c36770h1.f80172k;
        Intrinsics.checkNotNullExpressionValue(showMarkPriceGuideText, "showMarkPriceGuideText");
        String string2 = getString(R$string.bkumex_show_change_mark_price);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        m25330D4(showMarkPriceGuideText, string2);
    }

    /* JADX INFO: renamed from: M4 */
    public final void m25337M4(String str, String str2) {
        C36770h0 c36770h0 = this.f22882q0;
        C36770h0 c36770h1 = null;
        if (c36770h0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36770h0 = null;
        }
        BaseTextView baseTextView = c36770h0.f80169h;
        int i11 = R$string.stub;
        String string = getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        baseTextView.setText(C27041f.m66669i(str, string));
        C36770h0 c36770h2 = this.f22882q0;
        if (c36770h2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36770h1 = c36770h2;
        }
        BaseTextView baseTextView2 = c36770h1.f80168g;
        String string2 = getString(i11);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        baseTextView2.setText(C27041f.m66669i(str2, string2));
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C36770h0 c36770h0M82396c = C36770h0.m82396c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c36770h0M82396c, "inflate(...)");
        this.f22882q0 = c36770h0M82396c;
        if (c36770h0M82396c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36770h0M82396c = null;
        }
        LinearLayoutCompat root = c36770h0M82396c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f22883r0.clear();
        super.onDestroyView();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36770h0 c36770h0 = this.f22882q0;
        if (c36770h0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36770h0 = null;
        }
        c36770h0.f80173l.setText(getString(R$string.bkumex_position_estimated_liq_price));
        m25334J4();
        m25335K4();
        m25332H4();
        m25333I4();
        m25331E4();
        m25342x4();
    }

    /* JADX INFO: renamed from: r4 */
    public final String m25338r4(String str, ContractEntity contractEntity) {
        int i11 = R$string.stub;
        String string = getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strM66669i = C27041f.m66669i(str, string);
        String string2 = getString(i11);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return Intrinsics.areEqual(strM66669i, string2) ? strM66669i : C42828b.m93906g(strM66669i, C37567b.m84619i(contractEntity), true, false, 4, null);
    }

    /* JADX INFO: renamed from: t4 */
    public final LiqDescParams m25339t4() {
        return (LiqDescParams) this.f22884s0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m25313A4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "LiquidationDialog-observePosition");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final void m25314B4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C4 */
    public static final LiqDescParams m25315C4(LiqDescDialog liqDescDialog) {
        LiqDescParams liqDescParams;
        Bundle arguments = liqDescDialog.getArguments();
        if (arguments != null && (liqDescParams = (LiqDescParams) arguments.getParcelable("data")) != null) {
            return liqDescParams;
        }
        return new LiqDescParams(false, null, null, null, false, null, null, false, 254, null);
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m25316F4(LiqDescDialog liqDescDialog) {
        String strM101356x0;
        if (liqDescDialog.m25339t4().isCross()) {
            strM101356x0 = C45875l0.f103336a.m101342j0();
        } else {
            strM101356x0 = C45875l0.f103336a.m101356x0();
        }
        String str = strM101356x0;
        liqDescDialog.m25326s4();
        InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m25317G4(LiqDescDialog liqDescDialog) {
        if (liqDescDialog.getParentFragmentManager().findFragmentByTag("MarkPriceGuideDialog") == null) {
            MarkPriceGuideDialog markPriceGuideDialogNewInstance = MarkPriceGuideDialog.f22778r0.newInstance(liqDescDialog.m25339t4().getSymbol());
            FragmentManager parentFragmentManager = liqDescDialog.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            markPriceGuideDialogNewInstance.show(parentFragmentManager, "MarkPriceGuideDialog");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    private final void m25326s4() {
        List<Fragment> fragments = getParentFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (Fragment fragment : CollectionsKt.toList(fragments)) {
            if (fragment instanceof LiqDescDialog) {
                ((LiqDescDialog) fragment).dismissAllowingStateLoss();
            } else if (fragment instanceof MarkPriceGuideDialog) {
                ((MarkPriceGuideDialog) fragment).dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m25328y4(LiqDescDialog liqDescDialog, List list) {
        Object next;
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!liqDescDialog.m25341w4((PositionEntity) next, liqDescDialog.m25339t4()));
        PositionEntity positionEntity = (PositionEntity) next;
        if (positionEntity != null) {
            liqDescDialog.m25336L4(positionEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m25329z4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m25330D4(TextView textView, String str) {
        boolean z11 = true;
        if (textView.getResources().getConfiguration().getLayoutDirection() != 1) {
            z11 = false;
        }
        C27017c c27017c = C27017c.f54310a;
        Drawable drawableM66510d = C27017c.m66510d(c27017c, R$drawable.ic2_arrow_right_16, null, 2, null);
        drawableM66510d.setBounds(0, 0, drawableM66510d.getIntrinsicWidth(), drawableM66510d.getIntrinsicHeight());
        drawableM66510d.setTint(c27017c.m66512a(R$color.c_text));
        textView.setText(new SpannableStringBuilder(str).append((CharSequence) C33627eb.f69716f).append(C33627eb.f69716f, new C13111a(drawableM66510d, z11), 33));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m25332H4() {
        int i11;
        Context context = getContext();
        if (context == null) {
            return;
        }
        C36770h0 c36770h0 = this.f22882q0;
        C36770h0 c36770h1 = null;
        if (c36770h0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36770h0 = null;
        }
        BaseTextView baseTextView = c36770h0.f80165d;
        if (m25339t4().isCross()) {
            i11 = R$string.kc_bkumex_cross_estimated_liq_price;
        } else {
            i11 = R$string.kc_bkumex_isolate_estimated_liq_price;
        }
        baseTextView.setText(getString(i11));
        int color = ContextCompat.getColor(context, R$color.c_text);
        int color2 = ContextCompat.getColor(context, R$color.bkumex_liq_price_warning_text);
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        C36770h0 c36770h2 = this.f22882q0;
        if (c36770h2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36770h1 = c36770h2;
        }
        BaseTextView desc = c36770h1.f80165d;
        Intrinsics.checkNotNullExpressionValue(desc, "desc");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        if (!m25339t4().isCross()) {
            color2 = color;
        }
        Pair pair = new Pair(textTagEnum, new ForegroundColorSpan(color2));
        Pair pair2 = new Pair(textTagEnum, new StyleSpan(1));
        HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN1;
        Pair pair3 = new Pair(textTagEnum2, new ForegroundColorSpan(color));
        Pair pair4 = new Pair(textTagEnum2, new StyleSpan(1));
        HighlightTextHelper.TextTagEnum textTagEnum3 = HighlightTextHelper.TextTagEnum.SPAN2;
        highlightTextHelper.m54120f(desc, pair, pair2, pair3, pair4, new Pair(textTagEnum3, new ForegroundColorSpan(color)), new Pair(textTagEnum3, new StyleSpan(1)));
    }

    /* JADX INFO: renamed from: J4 */
    public final void m25334J4() {
        C36770h0 c36770h0 = null;
        if (m25339t4().isCross()) {
            C36770h0 c36770h1 = this.f22882q0;
            if (c36770h1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c36770h1 = null;
            }
            LinearLayout priceInfoContainer = c36770h1.f80170i;
            Intrinsics.checkNotNullExpressionValue(priceInfoContainer, "priceInfoContainer");
            ViewExtKt.m66577h(priceInfoContainer);
            C36770h0 c36770h2 = this.f22882q0;
            if (c36770h2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c36770h0 = c36770h2;
            }
            View topDivider = c36770h0.f80174m;
            Intrinsics.checkNotNullExpressionValue(topDivider, "topDivider");
            ViewExtKt.m66577h(topDivider);
            return;
        }
        C36770h0 c36770h3 = this.f22882q0;
        if (c36770h3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36770h3 = null;
        }
        LinearLayout priceInfoContainer2 = c36770h3.f80170i;
        Intrinsics.checkNotNullExpressionValue(priceInfoContainer2, "priceInfoContainer");
        C27046k.m66685H(priceInfoContainer2);
        C36770h0 c36770h4 = this.f22882q0;
        if (c36770h4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36770h0 = c36770h4;
        }
        View topDivider2 = c36770h0.f80174m;
        Intrinsics.checkNotNullExpressionValue(topDivider2, "topDivider");
        C27046k.m66685H(topDivider2);
        m25337M4(m25339t4().getMarkPriceText(), m25339t4().getLiquidationPriceText());
    }

    /* JADX INFO: renamed from: K4 */
    public final void m25335K4() {
        int i11;
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            i11 = GravityCompat.START;
        } else {
            i11 = GravityCompat.END;
        }
        C36770h0 c36770h0 = this.f22882q0;
        C36770h0 c36770h1 = null;
        if (c36770h0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36770h0 = null;
        }
        BaseTextView baseTextView = c36770h0.f80169h;
        C36770h0 c36770h2 = this.f22882q0;
        if (c36770h2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36770h1 = c36770h2;
        }
        for (BaseTextView baseTextView2 : CollectionsKt.listOf((Object[]) new BaseTextView[]{baseTextView, c36770h1.f80168g})) {
            baseTextView2.setLayoutDirection(0);
            baseTextView2.setTextDirection(3);
            baseTextView2.setGravity(i11 | 16);
        }
    }

    /* JADX INFO: renamed from: L4 */
    public final void m25336L4(PositionEntity positionEntity) {
        ContractEntity contractEntityM84661b = C37569d.m84661b(positionEntity);
        m25337M4(m25338r4(C37569d.m84669j(positionEntity, contractEntityM84661b), contractEntityM84661b), m25338r4(C37569d.m84664e(positionEntity, contractEntityM84661b), contractEntityM84661b));
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        m25340u4();
    }

    /* JADX INFO: renamed from: u4 */
    public final void m25340u4() {
        BottomSheetDialog bottomSheetDialog;
        BottomSheetBehavior<FrameLayout> behavior;
        final int iM6182d = (int) (C5267e0.m6182d() * 0.82f);
        Dialog dialog = getDialog();
        C36770h0 c36770h0 = null;
        if (dialog instanceof BottomSheetDialog) {
            bottomSheetDialog = (BottomSheetDialog) dialog;
        } else {
            bottomSheetDialog = null;
        }
        if (bottomSheetDialog != null && (behavior = bottomSheetDialog.getBehavior()) != null) {
            behavior.setMaxHeight(iM6182d);
            behavior.setPeekHeight(iM6182d);
            behavior.setSkipCollapsed(true);
            behavior.setDraggable(false);
            behavior.setState(3);
        }
        C36770h0 c36770h1 = this.f22882q0;
        if (c36770h1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36770h0 = c36770h1;
        }
        c36770h0.getRoot().post(new Runnable() { // from class: yh.h
            @Override // java.lang.Runnable
            public final void run() {
                LiqDescDialog.m25327v4(this.f104260b, iM6182d);
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public final boolean m25341w4(PositionEntity positionEntity, LiqDescParams liqDescParams) {
        String positionId = liqDescParams.getPositionId();
        if (positionId != null && positionId.length() != 0) {
            return Intrinsics.areEqual(positionEntity.getId(), liqDescParams.getPositionId());
        }
        if (Intrinsics.areEqual(positionEntity.getSymbol(), liqDescParams.getSymbol()) && Intrinsics.areEqual(positionEntity.getPositionSide(), liqDescParams.getPositionSide()) && positionEntity.isTrialFunds() == liqDescParams.isTrialFunds()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: x4 */
    public final void m25342x4() {
        if (!m25339t4().isCross() && m25339t4().getObservePosition()) {
            Observable observableObserveOn = MultiBizFacadeManager.m20246B(MultiBizFacadeManager.f19232a, m25339t4().isTrialFunds(), null, 2, null).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
            final Function1 function1 = new Function1() { // from class: yh.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LiqDescDialog.m25328y4(this.f104255b, (List) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: yh.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    LiqDescDialog.m25329z4(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: yh.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LiqDescDialog.m25313A4((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: yh.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    LiqDescDialog.m25314B4(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, this.f22883r0);
        }
    }
}
