package za0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.revolut.revolutpay.ui_kit.model.AbstractC27592b;
import com.revolut.revolutpay.ui_kit.model.C27593c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import xa0.C46120f;
import xa0.C46122h;
import xa0.InterfaceC46115a;

/* JADX INFO: renamed from: za0.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C46742a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f104561a;

    /* JADX INFO: renamed from: za0.a$a */
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<C46743b, Unit> f104562b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC27592b f104563c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super C46743b, Unit> function1, AbstractC27592b abstractC27592b) {
            this.f104562b = function1;
            this.f104563c = abstractC27592b;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            Integer numM68517e = ((C27593c) this.f104563c).m68517e();
            ds2.setColor(numM68517e != null ? numM68517e.intValue() : Color.parseColor("#0666EB"));
            ds2.setUnderlineText(((C27593c) this.f104563c).m68520h());
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Function1<C46743b, Unit> function1 = this.f104562b;
            if (function1 != null) {
                function1.invoke(new C46743b(((C27593c) this.f104563c).m68518f(), ((C27593c) this.f104563c).m68519g()));
            }
        }
    }

    public C46742a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f104561a = context;
    }

    /* JADX INFO: renamed from: a */
    public final CharSequence m102993a(int i11, List<? extends Object> list, Function1<? super C46743b, Unit> function1) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i12 = 0;
        for (Object illegalArgumentException : list) {
            if (illegalArgumentException instanceof InterfaceC46115a) {
                int i13 = i12 + 1;
                String strM102996d = m102996d(i12);
                arrayList.add(strM102996d);
                illegalArgumentException = strM102996d;
                i12 = i13;
            } else if (!(illegalArgumentException instanceof CharSequence)) {
                if (illegalArgumentException instanceof Integer) {
                    illegalArgumentException = this.f104561a.getResources().getString(((Number) illegalArgumentException).intValue());
                    Intrinsics.checkNotNullExpressionValue(illegalArgumentException, "context.resources.getString(arg)");
                } else {
                    illegalArgumentException = new IllegalArgumentException("Unsupported getString argument " + illegalArgumentException);
                }
            }
            arrayList2.add(illegalArgumentException);
        }
        Resources resources = this.f104561a.getResources();
        Object[] array = arrayList2.toArray(new Object[0]);
        String string = resources.getString(i11, Arrays.copyOf(array, array.length));
        Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr….toTypedArray()\n        )");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            InterfaceC46115a interfaceC46115a = obj instanceof InterfaceC46115a ? (InterfaceC46115a) obj : null;
            CharSequence charSequenceM102995c = interfaceC46115a != null ? m102995c(interfaceC46115a, function1) : null;
            if (charSequenceM102995c != null) {
                arrayList3.add(charSequenceM102995c);
            }
        }
        CharSequence charSequenceReplace = TextUtils.replace(string, (String[]) arrayList.toArray(new String[0]), (CharSequence[]) arrayList3.toArray(new CharSequence[0]));
        Intrinsics.checkNotNullExpressionValue(charSequenceReplace, "replace(template, uikitC…titutions.toTypedArray())");
        return charSequenceReplace;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m102994b(SpannableStringBuilder spannableStringBuilder, AbstractC27592b abstractC27592b, Function1<? super C46743b, Unit> function1) {
        if (abstractC27592b instanceof C27593c) {
            spannableStringBuilder.setSpan(new a(function1, abstractC27592b), 0, spannableStringBuilder.length(), 18);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m102995c(InterfaceC46115a interfaceC46115a, Function1<? super C46743b, Unit> function1) {
        SpannableStringBuilder spannableStringBuilderAppend;
        AbstractC27592b abstractC27592bM101637c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (interfaceC46115a instanceof C46120f) {
            C46120f c46120f = (C46120f) interfaceC46115a;
            spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) c46120f.m101628b());
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend, "builder.append(text)");
            abstractC27592bM101637c = c46120f.m101627a();
        } else {
            if (!(interfaceC46115a instanceof C46122h)) {
                throw new NoWhenBranchMatchedException();
            }
            C46122h c46122h = (C46122h) interfaceC46115a;
            spannableStringBuilderAppend = spannableStringBuilder.append(m102993a(c46122h.m101636b(), c46122h.m101635a(), function1));
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend, "builder.append(\n        …      )\n                )");
            abstractC27592bM101637c = c46122h.m101637c();
        }
        return m102994b(spannableStringBuilderAppend, abstractC27592bM101637c, function1);
    }

    /* JADX INFO: renamed from: d */
    public final String m102996d(int i11) {
        return '%' + i11 + "$uikit%";
    }

    /* JADX INFO: renamed from: e */
    public final void m102997e(@NotNull InterfaceC46115a clause, @NotNull TextView textView, @Nullable Function1<? super C46743b, Unit> function1) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setText(m102995c(clause, function1));
    }
}
