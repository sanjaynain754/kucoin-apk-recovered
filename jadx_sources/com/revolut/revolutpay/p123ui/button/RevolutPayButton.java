package com.revolut.revolutpay.p123ui.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cb0.C4929a;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.payment.service.IPaymentSiteService;
import com.revolut.revolutpay.R$drawable;
import com.revolut.revolutpay.R$id;
import com.revolut.revolutpay.R$layout;
import com.revolut.revolutpay.R$string;
import com.revolut.revolutpay.R$styleable;
import com.revolut.revolutpay.api.params.BoxText;
import com.revolut.revolutpay.api.params.BoxTextCurrency;
import com.revolut.revolutpay.api.params.BoxTextValue;
import com.revolut.revolutpay.api.params.ButtonParams;
import com.revolut.revolutpay.api.params.Radius;
import com.revolut.revolutpay.api.params.Size;
import com.revolut.revolutpay.api.params.Variant;
import com.tencent.qcloud.tuicore.TUIConstants;
import ia0.VariantModes;
import java.text.NumberFormat;
import java.util.Currency;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import qa0.C43676a;
import qa0.C43677b;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0002NOB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u0019\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J6\u0010/\u001a\u00020\t\"\b\b\u0000\u0010**\u00020)*\u00020+2\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0,¢\u0006\u0002\b-H\u0002¢\u0006\u0004\b/\u00100J\u0013\u00102\u001a\u000201*\u00020\u001bH\u0002¢\u0006\u0004\b2\u00103J\u0013\u00105\u001a\u000204*\u00020\u001bH\u0002¢\u0006\u0004\b5\u00106J\u0013\u00109\u001a\u000208*\u000207H\u0002¢\u0006\u0004\b9\u0010:R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010;R\u0016\u0010=\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010DR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010I¨\u0006P"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/button/RevolutPayButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "i", "Landroid/view/View$OnClickListener;", "clickListener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/revolut/revolutpay/api/params/ButtonParams;", "buttonParams", "f", "(Landroid/content/Context;Lcom/revolut/revolutpay/api/params/ButtonParams;)V", "k", "Lcom/revolut/revolutpay/api/params/BoxTextCurrency;", "boxTextCurrency", "Lcom/revolut/revolutpay/api/params/BoxTextValue;", "boxTextValue", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/revolut/revolutpay/api/params/BoxTextCurrency;Lcom/revolut/revolutpay/api/params/BoxTextValue;)Ljava/lang/String;", "Lcom/revolut/revolutpay/api/params/Size;", "size", "Lcom/revolut/revolutpay/api/params/BoxText;", "boxText", "d", "(Lcom/revolut/revolutpay/api/params/Size;Lcom/revolut/revolutpay/api/params/BoxText;Lcom/revolut/revolutpay/api/params/BoxTextCurrency;Lcom/revolut/revolutpay/api/params/BoxTextValue;)V", "Landroid/widget/TextView;", "button", "e", "(Lcom/revolut/revolutpay/api/params/Size;Landroid/widget/TextView;)V", "Lcom/revolut/revolutpay/api/params/Radius;", "radius", "c", "(Landroid/content/Context;Lcom/revolut/revolutpay/api/params/Radius;)V", "Landroid/view/ViewGroup$LayoutParams;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "n", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/revolut/revolutpay/api/params/Size;)Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;", "m", "(Lcom/revolut/revolutpay/api/params/Size;)Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;", "", "", "g", "(F)I", "Landroid/widget/TextView;", "o", "box", "Landroid/widget/ImageView;", "p", "Landroid/widget/ImageView;", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/view/ViewGroup;", "q", "Landroid/view/ViewGroup;", "buttonLayout", "r", "boxLayout", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/view/View$OnClickListener;", "t", "Lcom/revolut/revolutpay/api/params/ButtonParams;", "u", "internalClickListener", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class RevolutPayButton extends ConstraintLayout {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public TextView button;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public TextView box;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public ImageView icon;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public ViewGroup buttonLayout;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public ViewGroup boxLayout;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public View.OnClickListener clickListener;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public ButtonParams buttonParams;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final View.OnClickListener internalClickListener;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.button.RevolutPayButton$a */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u000b\u000f\u0010\rB9\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\u000e\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a;", "", "", ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, "cornerMargin", "textSizeSp", "<init>", "(FFFFFF)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "F", "d", "()F", "b", "c", "e", "f", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a$a;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a$b;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a$c;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a$d;", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static abstract class AbstractC27539a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final float paddingStart;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final float paddingEnd;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final float paddingTop;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final float paddingBottom;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final float cornerMargin;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final float textSizeSp;

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.button.RevolutPayButton$a$a */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a$a;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a;", "<init>", "()V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class a extends AbstractC27539a {

            /* JADX INFO: renamed from: g */
            @NotNull
            public static final a f56240g = new a();

            public a() {
                super(2.0f, 2.0f, 2.0f, 2.0f, 0.0f, 6.0f, null);
            }
        }

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.button.RevolutPayButton$a$b */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a$b;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a;", "<init>", "()V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class b extends AbstractC27539a {

            /* JADX INFO: renamed from: g */
            @NotNull
            public static final b f56241g = new b();

            public b() {
                super(6.0f, 6.0f, 4.0f, 4.0f, 16.0f, 10.0f, null);
            }
        }

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.button.RevolutPayButton$a$c */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a$c;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a;", "<init>", "()V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class c extends AbstractC27539a {

            /* JADX INFO: renamed from: g */
            @NotNull
            public static final c f56242g = new c();

            public c() {
                super(6.0f, 6.0f, 4.0f, 4.0f, 10.0f, 9.0f, null);
            }
        }

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.button.RevolutPayButton$a$d */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a$d;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$a;", "<init>", "()V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class d extends AbstractC27539a {

            /* JADX INFO: renamed from: g */
            @NotNull
            public static final d f56243g = new d();

            public d() {
                super(4.0f, 4.0f, 2.0f, 2.0f, 6.0f, 8.0f, null);
            }
        }

        public AbstractC27539a(float f11, float f12, float f13, float f14, float f15, float f16) {
            this.paddingStart = f11;
            this.paddingEnd = f12;
            this.paddingTop = f13;
            this.paddingBottom = f14;
            this.cornerMargin = f15;
            this.textSizeSp = f16;
        }

        public /* synthetic */ AbstractC27539a(float f11, float f12, float f13, float f14, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
            this(f11, f12, f13, f14, f15, f16);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getCornerMargin() {
            return this.cornerMargin;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getPaddingBottom() {
            return this.paddingBottom;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getPaddingEnd() {
            return this.paddingEnd;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getPaddingStart() {
            return this.paddingStart;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getPaddingTop() {
            return this.paddingTop;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getTextSizeSp() {
            return this.textSizeSp;
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.button.RevolutPayButton$b */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\f\u0010\u0012\u0011BA\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0010\u0010\u000f\u0082\u0001\u0004\u0015\u0016\u0017\u0018¨\u0006\u0019"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;", "", "", ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, "iconMargin", "textSizeSp", "iconSizeDp", "<init>", "(FFFFFFF)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "F", "e", "()F", "b", "d", "c", "f", "g", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b$a;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b$b;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b$c;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b$d;", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static abstract class AbstractC27540b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final float marginStart;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final float marginEnd;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final float marginTop;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final float marginBottom;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final float iconMargin;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final float textSizeSp;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final float iconSizeDp;

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.button.RevolutPayButton$b$a */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b$a;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;", "<init>", "()V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class a extends AbstractC27540b {

            /* JADX INFO: renamed from: h */
            @NotNull
            public static final a f56251h = new a();

            public a() {
                super(10.0f, 10.0f, 4.0f, 4.0f, 2.0f, 8.0f, 8.0f, null);
            }
        }

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.button.RevolutPayButton$b$b */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b$b;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;", "<init>", "()V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class b extends AbstractC27540b {

            /* JADX INFO: renamed from: h */
            @NotNull
            public static final b f56252h = new b();

            public b() {
                super(76.0f, 76.0f, 15.0f, 15.0f, 4.0f, 20.0f, 18.0f, null);
            }
        }

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.button.RevolutPayButton$b$c */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b$c;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;", "<init>", "()V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class c extends AbstractC27540b {

            /* JADX INFO: renamed from: h */
            @NotNull
            public static final c f56253h = new c();

            public c() {
                super(60.0f, 60.0f, 10.5f, 10.5f, 3.0f, 16.0f, 16.0f, null);
            }
        }

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.button.RevolutPayButton$b$d */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b$d;", "Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;", "<init>", "()V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class d extends AbstractC27540b {

            /* JADX INFO: renamed from: h */
            @NotNull
            public static final d f56254h = new d();

            public d() {
                super(35.0f, 35.0f, 6.0f, 6.0f, 2.0f, 12.0f, 12.0f, null);
            }
        }

        public AbstractC27540b(float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            this.marginStart = f11;
            this.marginEnd = f12;
            this.marginTop = f13;
            this.marginBottom = f14;
            this.iconMargin = f15;
            this.textSizeSp = f16;
            this.iconSizeDp = f17;
        }

        public /* synthetic */ AbstractC27540b(float f11, float f12, float f13, float f14, float f15, float f16, float f17, DefaultConstructorMarker defaultConstructorMarker) {
            this(f11, f12, f13, f14, f15, f16, f17);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getIconMargin() {
            return this.iconMargin;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getIconSizeDp() {
            return this.iconSizeDp;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getMarginBottom() {
            return this.marginBottom;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getMarginEnd() {
            return this.marginEnd;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getMarginStart() {
            return this.marginStart;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getMarginTop() {
            return this.marginTop;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getTextSizeSp() {
            return this.textSizeSp;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolutPayButton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.buttonParams = ButtonParams.INSTANCE.m103800default();
        this.internalClickListener = new View.OnClickListener() { // from class: com.revolut.revolutpay.ui.button.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RevolutPayButton.m68279j(this.f56255b, view);
            }
        };
        m68278i(context);
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.button.RevolutPayButton$c */
    @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
    public /* synthetic */ class C27541c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[BoxTextCurrency.values().length];
            try {
                iArr[BoxTextCurrency.GBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BoxTextCurrency.EUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BoxTextCurrency.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BoxTextValue.values().length];
            try {
                iArr2[BoxTextValue.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BoxTextValue.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BoxText.values().length];
            try {
                iArr3[BoxText.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[BoxText.GET_CASHBACK_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Radius.values().length];
            try {
                iArr4[Radius.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[Radius.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[Radius.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[Radius.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[Size.values().length];
            try {
                iArr5[Size.EXTRA_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[Size.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[Size.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[Size.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolutPayButton(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.buttonParams = ButtonParams.INSTANCE.m103800default();
        this.internalClickListener = new View.OnClickListener() { // from class: com.revolut.revolutpay.ui.button.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RevolutPayButton.m68279j(this.f56255b, view);
            }
        };
        m68286k(context, attrs);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, C43677b.f96508a.m96136b(this.buttonParams.getVariantModes().getLightMode(), this.buttonParams.getVariantModes().getDarkMode()));
        m68278i(contextThemeWrapper);
        m68283f(contextThemeWrapper, this.buttonParams);
    }

    /* JADX INFO: renamed from: i */
    private final void m68278i(Context context) {
        View.inflate(context, R$layout.internal_revolut_pay_button_layout, this);
        View viewFindViewById = findViewById(R$id.internalRevolutPay_buttonLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.internalRevolutPay_buttonLayout)");
        this.buttonLayout = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.internalRevolutPay_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.internalRevolutPay_button)");
        this.button = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.internalRevolutPay_box);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.internalRevolutPay_box)");
        this.box = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.internalRevolutPay_boxLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.internalRevolutPay_boxLayout)");
        this.boxLayout = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.internalRevolutPay_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.internalRevolutPay_icon)");
        this.icon = (ImageView) viewFindViewById5;
        setClickable(false);
        ViewGroup viewGroup = this.buttonLayout;
        TextView textView = null;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonLayout");
            viewGroup = null;
        }
        viewGroup.setOnClickListener(this.internalClickListener);
        TextView textView2 = this.box;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("box");
        } else {
            textView = textView2;
        }
        textView.setOnClickListener(this.internalClickListener);
    }

    /* JADX INFO: renamed from: f */
    public final void m68283f(@NotNull Context context, @NotNull ButtonParams buttonParams) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(buttonParams, "buttonParams");
        m68280c(context, buttonParams.getRadius());
        Size buttonSize = buttonParams.getButtonSize();
        TextView textView = this.button;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button");
            textView = null;
        }
        m68282e(buttonSize, textView);
        m68281d(buttonParams.getButtonSize(), buttonParams.getBoxText(), buttonParams.getBoxTextCurrency(), buttonParams.getBoxTextValue());
    }

    /* JADX INFO: renamed from: h */
    public final String m68285h(BoxTextCurrency boxTextCurrency, BoxTextValue boxTextValue) {
        String str;
        int i11;
        C4929a c4929a = C4929a.f5465a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(c4929a.m5148a(context));
        currencyInstance.setMaximumFractionDigits(0);
        int i12 = C27541c.$EnumSwitchMapping$0[boxTextCurrency.ordinal()];
        if (i12 == 1) {
            str = "GBP";
        } else if (i12 == 2) {
            str = IPaymentSiteService.Companion.EUR;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "USD";
        }
        currencyInstance.setCurrency(Currency.getInstance(str));
        int i13 = C27541c.$EnumSwitchMapping$1[boxTextValue.ordinal()];
        if (i13 == 1) {
            i11 = 25;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 10;
        }
        String boxTextValueAmount = currencyInstance.format(Integer.valueOf(i11));
        Intrinsics.checkNotNullExpressionValue(boxTextValueAmount, "boxTextValueAmount");
        return boxTextValueAmount;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC27539a m68287l(Size size) {
        int i11 = C27541c.$EnumSwitchMapping$4[size.ordinal()];
        if (i11 == 1) {
            return AbstractC27539a.a.f56240g;
        }
        if (i11 == 2) {
            return AbstractC27539a.d.f56243g;
        }
        if (i11 == 3) {
            return AbstractC27539a.c.f56242g;
        }
        if (i11 == 4) {
            return AbstractC27539a.b.f56241g;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC27540b m68288m(Size size) {
        int i11 = C27541c.$EnumSwitchMapping$4[size.ordinal()];
        if (i11 == 1) {
            return AbstractC27540b.a.f56251h;
        }
        if (i11 == 2) {
            return AbstractC27540b.d.f56254h;
        }
        if (i11 == 3) {
            return AbstractC27540b.c.f56253h;
        }
        if (i11 == 4) {
            return AbstractC27540b.b.f56252h;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener clickListener) {
        this.clickListener = clickListener;
    }

    /* JADX INFO: renamed from: j */
    public static final void m68279j(RevolutPayButton this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.clickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m68280c(Context context, Radius radius) {
        int i11;
        int i12;
        Resources resources = context.getResources();
        int[] iArr = C27541c.$EnumSwitchMapping$3;
        int i13 = iArr[radius.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        i11 = R$drawable.internal_revolut_pay_button_background_corner_radius_32;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i11 = R$drawable.internal_revolut_pay_button_background_corner_radius_12;
                }
            } else {
                i11 = R$drawable.internal_revolut_pay_button_background_corner_radius_8;
            }
        } else {
            i11 = R$drawable.internal_revolut_pay_button_background_corner_radius_0;
        }
        Drawable drawable = ResourcesCompat.getDrawable(resources, i11, context.getTheme());
        Resources resources2 = context.getResources();
        int i14 = iArr[radius.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    if (i14 == 4) {
                        i12 = R$drawable.internal_revolut_pay_box_background_corner_radius_8;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i12 = R$drawable.internal_revolut_pay_box_background_corner_radius_6;
                }
            } else {
                i12 = R$drawable.internal_revolut_pay_box_background_corner_radius_2;
            }
        } else {
            i12 = R$drawable.internal_revolut_pay_box_background_corner_radius_0;
        }
        Drawable drawable2 = ResourcesCompat.getDrawable(resources2, i12, context.getTheme());
        ViewGroup viewGroup = this.buttonLayout;
        TextView textView = null;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonLayout");
            viewGroup = null;
        }
        viewGroup.setBackground(drawable);
        TextView textView2 = this.box;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("box");
        } else {
            textView = textView2;
        }
        textView.setBackground(drawable2);
    }

    /* JADX INFO: renamed from: d */
    public final void m68281d(Size size, BoxText boxText, BoxTextCurrency boxTextCurrency, BoxTextValue boxTextValue) {
        String string;
        AbstractC27539a abstractC27539aM68287l = m68287l(size);
        int i11 = C27541c.$EnumSwitchMapping$2[boxText.ordinal()];
        ViewGroup viewGroup = null;
        TextView textView = null;
        boolean zAreEqual = true;
        if (i11 != 1) {
            if (i11 == 2) {
                if (!Intrinsics.areEqual(abstractC27539aM68287l, AbstractC27539a.b.f56241g)) {
                    zAreEqual = Intrinsics.areEqual(abstractC27539aM68287l, AbstractC27539a.c.f56242g);
                }
                if (zAreEqual || Intrinsics.areEqual(abstractC27539aM68287l, AbstractC27539a.d.f56243g)) {
                    string = getContext().getString(R$string.revolut_pay_button_info_cashback_value_small, m68285h(boxTextCurrency, boxTextValue));
                } else if (Intrinsics.areEqual(abstractC27539aM68287l, AbstractC27539a.a.f56240g)) {
                    string = getContext().getString(R$string.revolut_pay_button_info_cashback_extra_small);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullExpressionValue(string, "when (boxText) {\n       …}\n            }\n        }");
                final int iM68284g = m68284g(abstractC27539aM68287l.getCornerMargin());
                ViewGroup viewGroup2 = this.boxLayout;
                if (viewGroup2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("boxLayout");
                    viewGroup2 = null;
                }
                m68289n(viewGroup2, new Function1<ConstraintLayout.LayoutParams, Unit>() { // from class: com.revolut.revolutpay.ui.button.RevolutPayButton$applyBoxParams$1
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayout.LayoutParams layoutParams) {
                        invoke2(layoutParams);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ConstraintLayout.LayoutParams updateLayoutParams) {
                        Intrinsics.checkNotNullParameter(updateLayoutParams, "$this$updateLayoutParams");
                        int i12 = iM68284g;
                        ((ViewGroup.MarginLayoutParams) updateLayoutParams).leftMargin = i12;
                        ((ViewGroup.MarginLayoutParams) updateLayoutParams).rightMargin = i12;
                    }
                });
                ViewGroup viewGroup3 = this.boxLayout;
                if (viewGroup3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("boxLayout");
                    viewGroup3 = null;
                }
                viewGroup3.setVisibility(0);
                TextView textView2 = this.box;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("box");
                    textView2 = null;
                }
                textView2.setTextSize(abstractC27539aM68287l.getTextSizeSp());
                TextView textView3 = this.box;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("box");
                    textView3 = null;
                }
                textView3.setText(string);
                TextView textView4 = this.box;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("box");
                } else {
                    textView = textView4;
                }
                textView.setPadding(m68284g(abstractC27539aM68287l.getPaddingStart()), m68284g(abstractC27539aM68287l.getPaddingTop()), m68284g(abstractC27539aM68287l.getPaddingEnd()), m68284g(abstractC27539aM68287l.getPaddingBottom()));
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        ViewGroup viewGroup4 = this.boxLayout;
        if (viewGroup4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("boxLayout");
        } else {
            viewGroup = viewGroup4;
        }
        viewGroup.setVisibility(8);
    }

    /* JADX INFO: renamed from: e */
    public final void m68282e(Size size, TextView button) {
        final AbstractC27540b abstractC27540bM68288m = m68288m(size);
        ImageView imageView = this.icon;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TUIConstants.TUIChat.INPUT_MORE_ICON);
            imageView = null;
        }
        m68289n(imageView, new Function1<ConstraintLayout.LayoutParams, Unit>() { // from class: com.revolut.revolutpay.ui.button.RevolutPayButton$applyButtonSize$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayout.LayoutParams layoutParams) {
                invoke2(layoutParams);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ConstraintLayout.LayoutParams updateLayoutParams) {
                Intrinsics.checkNotNullParameter(updateLayoutParams, "$this$updateLayoutParams");
                int iM68284g = this.this$0.m68284g(abstractC27540bM68288m.getIconSizeDp());
                ((ViewGroup.MarginLayoutParams) updateLayoutParams).width = iM68284g;
                ((ViewGroup.MarginLayoutParams) updateLayoutParams).height = iM68284g;
            }
        });
        button.setTextSize(abstractC27540bM68288m.getTextSizeSp());
        ImageView imageView3 = this.icon;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TUIConstants.TUIChat.INPUT_MORE_ICON);
        } else {
            imageView2 = imageView3;
        }
        m68289n(imageView2, new Function1<ConstraintLayout.LayoutParams, Unit>() { // from class: com.revolut.revolutpay.ui.button.RevolutPayButton$applyButtonSize$2
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayout.LayoutParams layoutParams) {
                invoke2(layoutParams);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ConstraintLayout.LayoutParams updateLayoutParams) {
                Intrinsics.checkNotNullParameter(updateLayoutParams, "$this$updateLayoutParams");
                ((ViewGroup.MarginLayoutParams) updateLayoutParams).topMargin = this.this$0.m68284g(abstractC27540bM68288m.getMarginTop());
                ((ViewGroup.MarginLayoutParams) updateLayoutParams).bottomMargin = this.this$0.m68284g(abstractC27540bM68288m.getMarginBottom());
                ((ViewGroup.MarginLayoutParams) updateLayoutParams).leftMargin = this.this$0.m68284g(abstractC27540bM68288m.getMarginStart());
            }
        });
        m68289n(button, new Function1<ConstraintLayout.LayoutParams, Unit>() { // from class: com.revolut.revolutpay.ui.button.RevolutPayButton$applyButtonSize$3
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayout.LayoutParams layoutParams) {
                invoke2(layoutParams);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ConstraintLayout.LayoutParams updateLayoutParams) {
                Intrinsics.checkNotNullParameter(updateLayoutParams, "$this$updateLayoutParams");
                ((ViewGroup.MarginLayoutParams) updateLayoutParams).rightMargin = this.this$0.m68284g(abstractC27540bM68288m.getMarginEnd());
                ((ViewGroup.MarginLayoutParams) updateLayoutParams).leftMargin = this.this$0.m68284g(abstractC27540bM68288m.getIconMargin());
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final int m68284g(float f11) {
        return (int) TypedValue.applyDimension(1, f11, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: k */
    public final void m68286k(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R$styleable.RevolutPayButton, 0, 0);
        C43676a c43676a = C43676a.f96507a;
        Radius radiusM96131d = c43676a.m96131d(typedArrayObtainStyledAttributes.getInt(R$styleable.RevolutPayButton_revolutPay_Radius, -1));
        Size sizeM96132e = c43676a.m96132e(typedArrayObtainStyledAttributes.getInt(R$styleable.RevolutPayButton_revolutPay_Size, -1));
        Variant variantM96134g = c43676a.m96134g(typedArrayObtainStyledAttributes.getInt(R$styleable.RevolutPayButton_revolutPay_VariantLightTheme, -1));
        Variant variantM96133f = c43676a.m96133f(typedArrayObtainStyledAttributes.getInt(R$styleable.RevolutPayButton_revolutPay_VariantDarkTheme, -1));
        this.buttonParams = new ButtonParams(radiusM96131d, sizeM96132e, new VariantModes(variantM96134g, variantM96133f), c43676a.m96128a(typedArrayObtainStyledAttributes.getInt(R$styleable.RevolutPayButton_revolutPay_BoxText, -1)), c43676a.m96129b(typedArrayObtainStyledAttributes.getInt(R$styleable.RevolutPayButton_revolutPay_BoxTextCurrency, -1)), c43676a.m96130c(typedArrayObtainStyledAttributes.getInt(R$styleable.RevolutPayButton_revolutPay_BoxTextValue, -1)));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: n */
    public final <T extends ViewGroup.LayoutParams> void m68289n(View view, Function1<? super T, Unit> function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type T of com.revolut.revolutpay.ui.button.RevolutPayButton.updateLayoutParams");
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }
}
