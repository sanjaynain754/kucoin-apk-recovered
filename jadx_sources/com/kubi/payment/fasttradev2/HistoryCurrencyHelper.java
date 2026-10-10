package com.kubi.payment.fasttradev2;

import android.app.Application;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.otc.R$color;
import com.kubi.otc.R$font;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FlexBoxLayoutMaxLines;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p270ft.C37632i0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.payment.fasttradev2.l0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HistoryCurrencyHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/HistoryCurrencyHelper;", "", "<init>", "()V", "refreshHistoryUI", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/otc/databinding/HistoryCurrencyLayoutBinding;", "data", "", "itemTitle", "Lkotlin/Function1;", "", "itemClick", "deleteClick", "Lkotlin/Function0;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHistoryCurrencyHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryCurrencyHelper.kt\ncom/kubi/payment/fasttradev2/HistoryCurrencyHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1878#2,3:61\n*S KotlinDebug\n*F\n+ 1 HistoryCurrencyHelper.kt\ncom/kubi/payment/fasttradev2/HistoryCurrencyHelper\n*L\n32#1:61,3\n*E\n"})
public final class HistoryCurrencyHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HistoryCurrencyHelper f39384a = new HistoryCurrencyHelper();

    /* JADX INFO: renamed from: d */
    public static final Unit m47932d(BaseTextView baseTextView, C37632i0 c37632i0) {
        baseTextView.setTypeface(ResourcesCompat.getFont(c37632i0.f84031c.getContext(), R$font.regular));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final <T> void m47934c(@NotNull final C37632i0 c37632i0, @NotNull List<T> data, @NotNull Function1<? super T, String> function1, @NotNull final Function1<? super T, Unit> itemClick, @NotNull Function0<Unit> deleteClick) {
        Function1<? super T, String> itemTitle = function1;
        Intrinsics.checkNotNullParameter(c37632i0, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(itemTitle, "itemTitle");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        Intrinsics.checkNotNullParameter(deleteClick, "deleteClick");
        c37632i0.f84031c.removeAllViews();
        Application application = BaseApplication.INSTANCE.get();
        int color = ContextCompat.getColor(application, R$color.c_text);
        int color2 = ContextCompat.getColor(application, R$color.c_cover4);
        int i11 = 0;
        for (final T t11 : data) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            FlexBoxLayoutMaxLines flexBoxLayoutMaxLines = c37632i0.f84031c;
            final BaseTextView baseTextView = new BaseTextView(application);
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
            layoutParams.setMarginEnd(i11 == CollectionsKt.getLastIndex(data) ? 0 : C27040e.m66658b(12));
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C27040e.m66658b(12);
            baseTextView.setLayoutParams(layoutParams);
            C27100x0.m66923d(new Function0() { // from class: com.kubi.payment.fasttradev2.j0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HistoryCurrencyHelper.m47932d(baseTextView, c37632i0);
                }
            });
            baseTextView.setText(C27041f.m66668h(itemTitle.invoke(t11)));
            baseTextView.setTextColor(color);
            baseTextView.setTextSize(2, 14.0f);
            baseTextView.setPadding(C27040e.m66658b(8), C27040e.m66658b(4), C27040e.m66658b(8), C27040e.m66658b(4));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color2);
            gradientDrawable.setCornerRadius(C27040e.m66657a(8.0f));
            baseTextView.setBackground(gradientDrawable);
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.k0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HistoryCurrencyHelper.m47933e(itemClick, t11);
                }
            }, 1, null);
            flexBoxLayoutMaxLines.addView(baseTextView);
            itemTitle = function1;
            i11 = i12;
        }
        AppCompatImageView deleteHistory = c37632i0.f84030b;
        Intrinsics.checkNotNullExpressionValue(deleteHistory, "deleteHistory");
        C27046k.m66711z(deleteHistory, 0L, deleteClick, 1, null);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m47933e(Function1 function1, Object obj) {
        function1.invoke(obj);
        return Unit.INSTANCE;
    }
}
