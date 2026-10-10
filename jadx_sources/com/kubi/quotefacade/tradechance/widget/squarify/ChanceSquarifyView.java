package com.kubi.quotefacade.tradechance.widget.squarify;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.res.ResourcesCompat;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.mvi.common.MviExKt;
import com.kubi.quotefacade.R$attr;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$font;
import com.kubi.quotefacade.entity.ChancePlateItem;
import com.kubi.resources.C22890g;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ChanceSquarifyView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\t\u0018\u0000 Q2\u00020\u0001:\u0001QB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ4\u0010)\u001a\u00020!2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+2\u001c\b\u0002\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 J\u0016\u0010-\u001a\u00020!2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0007J\u0010\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u00020!H\u0002J\u0010\u00102\u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u00103\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100J\u001a\u00104\u001a\u00020!2\u0006\u00105\u001a\u00020\u00112\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u001a\u00106\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00105\u001a\u00020\u0011H\u0002J(\u00107\u001a\u00020!2\u0006\u00108\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001b0+2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u0012\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0017J*\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\u0007H\u0002J\u0016\u0010E\u001a\u00020!2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002J \u0010G\u001a\u00020@2\u0006\u0010H\u001a\u00020I2\u0006\u0010B\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0007H\u0002J*\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020@2\u0006\u0010L\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\b\u0010N\u001a\u00020!H\u0014J\b\u0010O\u001a\u00020\u0007H\u0003J\b\u0010P\u001a\u00020\u0007H\u0003R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00110#j\b\u0012\u0004\u0012\u00020\u0011`$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006R"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarifyView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "titlePaint", "Landroid/text/TextPaint;", "ratePaint", "coinsPaint", "rootNode", "Lcom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarifyNode;", ViewProps.BORDER_WIDTH, "", ViewProps.BORDER_COLOR, "textPaddingHorizontal", "textPaddingVertical", "lineSpace", "runnable", "Ljava/lang/Runnable;", "lastPlateItems", "", "clickRect", "lastClickTime", "", "onNodeClick", "Lkotlin/Function2;", "", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "updateData", "plateItems", "", "Lcom/kubi/quotefacade/entity/ChancePlateItem;", "updateDataForTest", "onDraw", "canvas", "Landroid/graphics/Canvas;", "initTextPaint", "initCommonTextPaint", "drawRects", "drawRect", "it", "drawBorder", "drawTexts", "rect", "Landroid/graphics/Rect;", "texts", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "buildSingleLineLayout", "Landroid/text/StaticLayout;", "text", ViewProps.MAX_WIDTH, ViewProps.MAX_HEIGHT, "textIndex", "data2Rect", FirebaseAnalytics.Param.ITEMS, "makeStaticLayout", "newText", "", "drawText", "staticLayout", "x", "y", "onDetachedFromWindow", "getUpColor", "getDownColor", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChanceSquarifyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChanceSquarifyView.kt\ncom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarifyView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1869#2,2:349\n1068#2:351\n1563#2:352\n1634#2,3:353\n1#3:356\n*S KotlinDebug\n*F\n+ 1 ChanceSquarifyView.kt\ncom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarifyView\n*L\n143#1:349,2\n255#1:351\n263#1:352\n263#1:353,3\n*E\n"})
public final class ChanceSquarifyView extends View {

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Companion f42707r = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f42708b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TextPaint f42709c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TextPaint f42710d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TextPaint f42711e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public ChanceSquarifyNode f42712f;

    /* JADX INFO: renamed from: g */
    public float f42713g;

    /* JADX INFO: renamed from: h */
    public final int f42714h;

    /* JADX INFO: renamed from: i */
    public float f42715i;

    /* JADX INFO: renamed from: j */
    public float f42716j;

    /* JADX INFO: renamed from: k */
    public float f42717k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Runnable f42718l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public String f42719m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public ChanceSquarifyNode f42720n;

    /* JADX INFO: renamed from: o */
    public long f42721o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Function2<? super ChanceSquarifyNode, ? super Integer, Unit> f42722p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public ArrayList<ChanceSquarifyNode> f42723q;

    /* JADX INFO: compiled from: ChanceSquarifyView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarifyView$Companion;", "", "<init>", "()V", "CLICK_TIME", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.widget.squarify.ChanceSquarifyView$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 ChanceSquarifyView.kt\ncom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarifyView\n*L\n1#1,328:1\n256#2:329\n*E\n"})
    public static final class C22587a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            ChancePlateItem chancePlateItem = (ChancePlateItem) t12;
            int iM66650j = C27039d.m66650j(chancePlateItem.getWeight());
            List<String> hotCurrencyNameList = chancePlateItem.getHotCurrencyNameList();
            Integer numValueOf = Integer.valueOf(iM66650j * C27039d.m66650j(hotCurrencyNameList != null ? Integer.valueOf(hotCurrencyNameList.size()) : null));
            ChancePlateItem chancePlateItem2 = (ChancePlateItem) t11;
            int iM66650j2 = C27039d.m66650j(chancePlateItem2.getWeight());
            List<String> hotCurrencyNameList2 = chancePlateItem2.getHotCurrencyNameList();
            return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(iM66650j2 * C27039d.m66650j(hotCurrencyNameList2 != null ? Integer.valueOf(hotCurrencyNameList2.size()) : null)));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChanceSquarifyView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: o */
    public final void m53281o(Rect rect, List<String> list, Canvas canvas) {
        StaticLayout staticLayoutM53275h;
        int iM66658b = C27040e.m66658b(6);
        float height = 0.0f;
        for (int i11 = 0; i11 < list.size(); i11++) {
            float f11 = 2;
            float f12 = iM66658b;
            float fWidth = (rect.width() - (this.f42715i * f11)) - f12;
            float fHeight = (rect.height() - (this.f42716j * f11)) - height;
            if (fWidth <= 0.0f || fHeight <= 0.0f || (staticLayoutM53275h = m53275h(list.get(i11), (int) fWidth, fHeight, i11)) == null) {
                return;
            }
            m53280n(staticLayoutM53275h, C5303w0.m6511a() ? ((rect.right - this.f42715i) - f12) - staticLayoutM53275h.getLineWidth(0) : this.f42715i + rect.left + f12, this.f42716j + rect.top + height, canvas);
            height += staticLayoutM53275h.getHeight();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m53282p(Paint paint) {
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(C27040e.m66657a(2.0f));
        paint.setTextAlign(Paint.Align.LEFT);
    }

    /* JADX INFO: renamed from: r */
    public final StaticLayout m53284r(CharSequence charSequence, int i11, int i12) {
        TextPaint textPaint;
        if (i12 != 0) {
            textPaint = i12 != 1 ? this.f42711e : this.f42710d;
        } else {
            textPaint = this.f42709c;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11);
        Intrinsics.checkNotNullExpressionValue(builderObtain, "obtain(...)");
        builderObtain.setTextDirection(TextDirectionHeuristics.LTR);
        StaticLayout staticLayoutBuild = builderObtain.setEllipsize(TextUtils.TruncateAt.END).setMaxLines(1).build();
        Intrinsics.checkNotNull(staticLayoutBuild);
        return staticLayoutBuild;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChanceSquarifyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: j */
    public static final CharSequence m53273j(String currency) {
        String currency2;
        Intrinsics.checkNotNullParameter(currency, "currency");
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(currency);
        return (coinInfoEntityM85613u == null || (currency2 = coinInfoEntityM85613u.getCurrency()) == null) ? currency : currency2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m53274t(ChanceSquarifyView chanceSquarifyView, List list, Function2 function2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function2 = null;
        }
        chanceSquarifyView.m53285s(list, function2);
    }

    @NotNull
    public final ArrayList<ChanceSquarifyNode> getData() {
        return this.f42723q;
    }

    /* JADX INFO: renamed from: i */
    public final void m53276i(List<ChancePlateItem> list) {
        BigDecimal bigDecimalM66671k;
        double width = getWidth() * getHeight();
        this.f42712f.m53300j(width);
        List<ChancePlateItem> listSortedWith = CollectionsKt.sortedWith(list, new C22587a());
        Iterator<T> it = list.iterator();
        int iM66650j = 0;
        while (true) {
            Integer numValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            ChancePlateItem chancePlateItem = (ChancePlateItem) it.next();
            int iM66650j2 = C27039d.m66650j(chancePlateItem.getWeight());
            List<String> hotCurrencyNameList = chancePlateItem.getHotCurrencyNameList();
            if (hotCurrencyNameList != null) {
                numValueOf = Integer.valueOf(hotCurrencyNameList.size());
            }
            iM66650j += iM66650j2 * C27039d.m66650j(numValueOf);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        for (ChancePlateItem chancePlateItem2 : listSortedWith) {
            double dM66650j = C27039d.m66650j(chancePlateItem2.getWeight());
            List<String> hotCurrencyNameList2 = chancePlateItem2.getHotCurrencyNameList();
            double dM66650j2 = ((dM66650j * ((double) C27039d.m66650j(hotCurrencyNameList2 != null ? Integer.valueOf(hotCurrencyNameList2.size()) : null))) / ((double) iM66650j)) * width;
            double dM66647g = C27039d.m66647g(C27041f.m66671k(chancePlateItem2.getAvgChangeRate()));
            String strM66668h = C27041f.m66668h(chancePlateItem2.getTagId());
            String strM66668h2 = C27041f.m66668h(chancePlateItem2.getTitle());
            String avgChangeRate = chancePlateItem2.getAvgChangeRate();
            String strM92649n = C42180b.m92649n(C42828b.m93911l((avgChangeRate == null || (bigDecimalM66671k = C27041f.m66671k(avgChangeRate)) == null) ? null : C42180b.m92642g(bigDecimalM66671k, null, null, 0, true, false, false, 55, null)));
            List<String> hotCurrencyNameList3 = chancePlateItem2.getHotCurrencyNameList();
            arrayList.add(new ChanceSquarifyNode(dM66650j2, dM66647g, CollectionsKt.mutableListOf(strM66668h2, strM92649n, C27041f.m66668h(hotCurrencyNameList3 != null ? CollectionsKt.joinToString$default(hotCurrencyNameList3, ",", null, null, 0, null, new Function1() { // from class: com.kubi.quotefacade.tradechance.widget.squarify.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChanceSquarifyView.m53273j((String) obj);
                }
            }, 30, null) : null)), strM66668h));
        }
        this.f42712f.m53298h(arrayList);
        ChanceSquarify.f42724a.m53288a(2.0d, this.f42712f, 0.0d, 0.0d, getWidth(), getHeight());
        this.f42723q.addAll(this.f42712f.m53292b());
    }

    /* JADX INFO: renamed from: k */
    public final void m53277k(Canvas canvas, ChanceSquarifyNode chanceSquarifyNode) {
        this.f42708b.setStrokeWidth(this.f42713g);
        this.f42708b.setStyle(Paint.Style.STROKE);
        this.f42708b.setColor(this.f42714h);
        if (canvas != null) {
            canvas.drawRect(chanceSquarifyNode.m53294d(), this.f42708b);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m53279m(@Nullable Canvas canvas) {
        for (ChanceSquarifyNode chanceSquarifyNode : this.f42723q) {
            m53278l(chanceSquarifyNode, canvas);
            m53277k(canvas, chanceSquarifyNode);
            m53281o(chanceSquarifyNode.m53294d(), chanceSquarifyNode.m53296f(), canvas);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m53280n(StaticLayout staticLayout, float f11, float f12, Canvas canvas) {
        if (canvas != null) {
            canvas.save();
        }
        if (canvas != null) {
            canvas.translate(f11, f12);
        }
        staticLayout.draw(canvas);
        if (canvas != null) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        m53279m(canvas);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        Function2<? super ChanceSquarifyNode, ? super Integer, Unit> function2;
        Integer numValueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            Iterator<ChanceSquarifyNode> it = this.f42723q.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                ChanceSquarifyNode next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                ChanceSquarifyNode chanceSquarifyNode = next;
                if (chanceSquarifyNode.m53294d().contains((int) event.getX(), (int) event.getY())) {
                    this.f42721o = System.currentTimeMillis();
                    this.f42720n = chanceSquarifyNode;
                    return true;
                }
            }
            performClick();
        } else if (numValueOf != null && numValueOf.intValue() == 1 && System.currentTimeMillis() - this.f42721o < 1000) {
            Iterator<ChanceSquarifyNode> it2 = this.f42723q.iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
            while (it2.hasNext()) {
                ChanceSquarifyNode next2 = it2.next();
                Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                ChanceSquarifyNode chanceSquarifyNode2 = next2;
                if (chanceSquarifyNode2.m53294d().contains((int) event.getX(), (int) event.getY())) {
                    if (!Intrinsics.areEqual(chanceSquarifyNode2, this.f42720n) || (function2 = this.f42722p) == null) {
                        break;
                        break;
                    }
                    function2.invoke(chanceSquarifyNode2, Integer.valueOf(this.f42723q.indexOf(chanceSquarifyNode2) + 1));
                    break;
                }
            }
        }
        return super.onTouchEvent(event);
    }

    /* JADX INFO: renamed from: q */
    public final void m53283q() {
        m53282p(this.f42709c);
        m53282p(this.f42710d);
        m53282p(this.f42711e);
        TextPaint textPaint = this.f42709c;
        Context context = getContext();
        int i11 = R$font.medium;
        textPaint.setTypeface(ResourcesCompat.getFont(context, i11));
        TextPaint textPaint2 = this.f42709c;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textPaint2.setTextSize(C27025c.m66568f(context2, 12));
        this.f42710d.setTypeface(ResourcesCompat.getFont(getContext(), i11));
        TextPaint textPaint3 = this.f42710d;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textPaint3.setTextSize(C27025c.m66568f(context3, 10));
        this.f42711e.setTypeface(ResourcesCompat.getFont(getContext(), R$font.regular));
        TextPaint textPaint4 = this.f42711e;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        textPaint4.setTextSize(C27025c.m66568f(context4, 10));
    }

    /* JADX INFO: renamed from: s */
    public final void m53285s(@Nullable List<ChancePlateItem> list, @Nullable Function2<? super ChanceSquarifyNode, ? super Integer, Unit> function2) {
        MviExKt.m42518n(new ChanceSquarifyView$updateData$1(this, function2, list, null));
    }

    public final void setData(@NotNull ArrayList<ChanceSquarifyNode> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.f42723q = arrayList;
    }

    public /* synthetic */ ChanceSquarifyView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @ColorInt
    private final int getDownColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM54277b = C22890g.m54277b(context, R$attr.downColor8);
        if (iM54277b == 0) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return C27046k.m66699n(context2, R$color.brandRed8);
        }
        return iM54277b;
    }

    @ColorInt
    private final int getUpColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM54277b = C22890g.m54277b(context, R$attr.upColor8);
        if (iM54277b == 0) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return C27046k.m66699n(context2, R$color.brandGreen8);
        }
        return iM54277b;
    }

    /* JADX INFO: renamed from: h */
    public final StaticLayout m53275h(String str, int i11, float f11, int i12) {
        if (m53284r(str, i11, i12).getHeight() > f11) {
            return null;
        }
        return m53284r(str, i11, i12);
    }

    /* JADX INFO: renamed from: l */
    public final void m53278l(ChanceSquarifyNode chanceSquarifyNode, Canvas canvas) {
        if (C27039d.m66646f(Double.valueOf(chanceSquarifyNode.getF42725a())) < 0.0d) {
            this.f42708b.setColor(getDownColor());
            TextPaint textPaint = this.f42709c;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textPaint.setColor(C22890g.m54289n(context));
            TextPaint textPaint2 = this.f42710d;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textPaint2.setColor(C22890g.m54289n(context2));
            TextPaint textPaint3 = this.f42711e;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            textPaint3.setColor(C22890g.m54289n(context3));
        } else {
            this.f42708b.setColor(getUpColor());
            TextPaint textPaint4 = this.f42709c;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            textPaint4.setColor(C22890g.m54291p(context4));
            TextPaint textPaint5 = this.f42710d;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            textPaint5.setColor(C22890g.m54291p(context5));
            TextPaint textPaint6 = this.f42711e;
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            textPaint6.setColor(C22890g.m54291p(context6));
        }
        this.f42708b.setStyle(Paint.Style.FILL);
        if (canvas != null) {
            canvas.drawRect(chanceSquarifyNode.m53294d(), this.f42708b);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f42718l;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChanceSquarifyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42708b = new Paint();
        this.f42709c = new TextPaint();
        this.f42710d = new TextPaint();
        this.f42711e = new TextPaint();
        this.f42712f = new ChanceSquarifyNode(0.0d, 0.0d, null, null, 14, null);
        this.f42713g = C27040e.m66657a(3.0f);
        this.f42714h = C27046k.m66699n(context, R$color.c_overlay);
        this.f42715i = C27040e.m66657a(3.0f);
        this.f42716j = C27040e.m66657a(4.0f);
        this.f42717k = 1.0f;
        this.f42719m = "";
        this.f42723q = new ArrayList<>();
        m53283q();
    }
}
