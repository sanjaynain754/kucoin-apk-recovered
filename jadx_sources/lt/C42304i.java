package lt;

import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import et.C37242d;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lt.i */
/* JADX INFO: compiled from: TextViewExt.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u000b"}, m90084d2 = {"setNewUserTag", "", "Landroid/widget/TextView;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "newUserTag", "", "newUserTagTip", "onNewUserTagClick", "context", "Landroid/content/Context;", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42304i {

    /* JADX INFO: renamed from: lt.i$a */
    /* JADX INFO: compiled from: TextViewExt.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/otc/utils/TextViewExtKt$onNewUserTagClick$1$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DialogFragmentHelper f93804b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f93805c;

        public a(DialogFragmentHelper dialogFragmentHelper, Context context) {
            this.f93804b = dialogFragmentHelper;
            this.f93805c = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C37242d.f82569a.m83353f(), null, null, null, null, null, null, 126, null);
            this.f93804b.dismiss();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(this.f93805c, R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m92847d(final Context context, FragmentManager fragmentManager) {
        DialogFragmentHelper.f43568p0.newInstance(R$layout.payment_dialog_bottom_title_content, true).m54237f4(new Function2() { // from class: lt.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C42304i.m92848e(context, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager, "payment_p2p_new_user_tag");
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m92848e(Context context, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_title);
        if (textView != null) {
            textView.setText(ContextCompat.getString(context, R$string.payment_p2p_special_ad_title));
        }
        TextView textView2 = (TextView) viewHolder.getView(R$id.tv_content);
        if (textView2 != null) {
            textView2.setText(ContextCompat.getString(context, R$string.payment_p2p_special_ad_des));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper.f43497a.m54120f(textView2, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new a(dialogFragmentHelper, context)));
        }
        TextView textView3 = (TextView) viewHolder.getView(R$id.tv_end);
        if (textView3 != null) {
            textView3.setText(ContextCompat.getString(context, R$string.payment_ok));
            C27046k.m66711z(textView3, 0L, new Function0() { // from class: lt.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C42304i.m92849f(dialogFragmentHelper);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m92850g(@NotNull final TextView textView, @NotNull final FragmentManager fragmentManager, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (Intrinsics.areEqual(C27041f.m66668h(str), "1")) {
            C27046k.m66685H(textView);
        } else {
            C27046k.m66700o(textView);
        }
        textView.setText(C27041f.m66668h(str2));
        C27046k.m66711z(textView, 0L, new Function0() { // from class: lt.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42304i.m92851h(textView, fragmentManager);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m92849f(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m92851h(TextView textView, FragmentManager fragmentManager) {
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        m92847d(context, fragmentManager);
        return Unit.INSTANCE;
    }
}
