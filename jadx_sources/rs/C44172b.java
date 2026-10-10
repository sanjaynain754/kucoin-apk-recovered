package rs;

import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.core.widget.TextViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.numeric.kit.R$array;
import com.kubi.numeric.kit.R$id;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: rs.b */
/* JADX INFO: compiled from: NumberDisplayRule.kt */
/* JADX INFO: loaded from: classes31.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0001\u001a\u001e\u0010\u0010\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0001\u001a\u001e\u0010\u0013\u001a\u00020\t*\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0000\u001a\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015H\u0002\u001a(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0000\u001a$\u0010\u001d\u001a\u00020\t*\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0002\u001a$\u0010\u001e\u001a\u00020\t*\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\tH\u0000\u001a\f\u0010!\u001a\u00020\"*\u00020\fH\u0000\u001a\u000e\u0010#\u001a\u00020\u0001*\u0004\u0018\u00010\tH\u0000\u001a\u0012\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\t\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"enable_auto_fit_number", "", "getEnable_auto_fit_number", "()Z", "setEnable_auto_fit_number", "(Z)V", "computePaint", "Landroid/graphics/Paint;", "TAG", "", "truncateText", "", "Landroid/widget/TextView;", "mode", "Lcom/kubi/numeric/kit/NumberMode;", "scaleText", "autoFitNumber", "numberMode", "textLocal", "truncate", "ellipsisCount", "", "convertWithUnit", "integerPart", "needTruncate", "scientificMode", "number", "decimalPart", "precision", "lessMode", "withUnit", TtmlNode.TEXT_EMPHASIS_MARK_DOT, "unit", "oriTextSize", "", "isNumber", "withSuffix", CmcdData.Factory.STREAMING_FORMAT_SS, "LNumericKit_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNumberDisplayRule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NumberDisplayRule.kt\ncom/kubi/numeric/kit/NumberDisplayRuleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 NumericIssue.kt\ncom/kubi/numeric/exception/NumericIssueKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 6 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 7 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,368:1\n13493#2,2:369\n58#3,23:371\n93#3,3:394\n64#4,4:397\n64#4,4:401\n52#4,4:405\n64#4,4:409\n64#4,4:413\n64#4,4:417\n64#4,4:421\n64#4,4:425\n64#4,4:429\n64#4,4:435\n64#4,4:439\n1069#5,2:433\n35#6,4:443\n39#6:449\n44#7,2:447\n*S KotlinDebug\n*F\n+ 1 NumberDisplayRule.kt\ncom/kubi/numeric/kit/NumberDisplayRuleKt\n*L\n76#1:369,2\n141#1:371,23\n141#1:394,3\n170#1:397,4\n202#1:401,4\n210#1:405,4\n217#1:409,4\n237#1:413,4\n256#1:417,4\n266#1:421,4\n272#1:425,4\n279#1:429,4\n313#1:435,4\n334#1:439,4\n296#1:433,2\n38#1:443,4\n38#1:449\n38#1:447,2\n*E\n"})
public final class C44172b {

    /* JADX INFO: renamed from: a */
    public static boolean f97508a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Paint f97509b;

    /* JADX INFO: renamed from: rs.b$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 NumberDisplayRule.kt\ncom/kubi/numeric/kit/NumberDisplayRuleKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n142#2,7:98\n71#3:105\n77#4:106\n*E\n"})
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f97510b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC44173c f97511c;

        public a(TextView textView, AbstractC44173c abstractC44173c) {
            this.f97510b = textView;
            this.f97511c = abstractC44173c;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            if (C44172b.m97385e()) {
                if (this.f97510b.getTextSize() < C44172b.m97387g(this.f97510b)) {
                    TextView textView = this.f97510b;
                    textView.setTextSize(0, C44172b.m97387g(textView));
                }
                TextView textView2 = this.f97510b;
                AbstractC44173c abstractC44173c = this.f97511c;
                C44172b.m97388h(textView2, abstractC44173c, abstractC44173c.getF97513b());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: rs.b$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final TextView m97382b(@NotNull final TextView textView, @NotNull final AbstractC44173c numberMode, boolean z11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(numberMode, "numberMode");
        if (!f97508a) {
            return textView;
        }
        int i11 = R$id.auto_fit_number;
        Object tag = textView.getTag(i11);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(tag, bool)) {
            return textView;
        }
        textView.setTag(i11, bool);
        textView.setTag(R$id.ori_text_size, Float.valueOf(textView.getTextSize()));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (!z11) {
            textView.setTextDirection(3);
        }
        textView.setGravity((textView.getGravity() & (-49)) | 16);
        if ((textView.getGravity() & GravityCompat.END) == 8388613) {
            textView.setTextAlignment(6);
        } else if ((textView.getGravity() & GravityCompat.START) == 8388611) {
            textView.setTextAlignment(5);
        }
        textView.addTextChangedListener(new a(textView, numberMode));
        textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: rs.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                C44172b.m97384d(textView, numberMode, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
        return textView;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m97386f(@Nullable String str) {
        return (str == null || StringsKt.contains$default((CharSequence) str, (CharSequence) ExifInterface.LONGITUDE_EAST, false, 2, (Object) null) || StringsKt.toDoubleOrNull(StringsKt.replace$default(str, ",", "", false, 4, (Object) null)) == null) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static final void m97388h(@NotNull TextView textView, @NotNull AbstractC44173c mode, boolean z11) {
        int iCeil;
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (textView.getMeasuredWidth() <= 0) {
            return;
        }
        String string = textView.getText().toString();
        if (m97386f(string)) {
            float fMeasureText = textView.getPaint().measureText(string);
            int iMax = ((textView.getMaxWidth() != Integer.MAX_VALUE ? Math.max(textView.getMeasuredWidth(), textView.getMaxWidth()) : textView.getMeasuredWidth()) - textView.getPaddingStart()) - textView.getPaddingEnd();
            Layout layout = textView.getLayout();
            if (layout != null) {
                iCeil = layout.getEllipsisCount(0);
            } else {
                float f11 = iMax;
                iCeil = (f11 >= fMeasureText || ((layoutParams = textView.getLayoutParams()) != null && layoutParams.width == -2)) ? 0 : (int) Math.ceil((fMeasureText - f11) / (fMeasureText / string.length()));
            }
            if (iCeil > 0) {
                float fM97387g = m97387g(textView);
                Paint paint = f97509b;
                paint.set(textView.getPaint());
                paint.setTextSize(fM97387g);
                if (z11) {
                    int[] intArray = textView.getResources().getIntArray(R$array.number_text_sizes);
                    Intrinsics.checkNotNullExpressionValue(intArray, "getIntArray(...)");
                    for (int i11 : intArray) {
                        Context context = textView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        float fM66568f = C27025c.m66568f(context, i11);
                        if (fM66568f < fM97387g) {
                            Paint paint2 = f97509b;
                            paint2.setTextSize(fM66568f);
                            if (paint2.measureText(string) <= iMax) {
                                textView.setMinHeight(textView.getMeasuredHeight());
                                TextViewCompat.setAutoSizeTextTypeWithDefaults(textView, 0);
                                textView.setTextSize(0, fM66568f);
                                return;
                            }
                        }
                    }
                    textView.setTextSize(0, fM97387g);
                }
            }
        }
    }

    static {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_enable_auto_fit_number", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        Boolean bool = (Boolean) objM20457a;
        f97508a = bool != null ? bool.booleanValue() : false;
        f97509b = new Paint();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ TextView m97383c(TextView textView, AbstractC44173c abstractC44173c, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC44173c = new AbstractC44173c.b(12, false, 2, null);
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m97382b(textView, abstractC44173c, z11);
    }

    /* JADX INFO: renamed from: d */
    public static final void m97384d(TextView textView, AbstractC44173c abstractC44173c, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (f97508a) {
            m97388h(textView, abstractC44173c, abstractC44173c.getF97513b());
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m97385e() {
        return f97508a;
    }

    /* JADX INFO: renamed from: g */
    public static final float m97387g(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Object tag = textView.getTag(R$id.ori_text_size);
        Float f11 = tag instanceof Float ? (Float) tag : null;
        return f11 != null ? f11.floatValue() : textView.getTextSize();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m97389i(TextView textView, AbstractC44173c abstractC44173c, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        m97388h(textView, abstractC44173c, z11);
    }
}
