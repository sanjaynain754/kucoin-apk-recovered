package com.kubi.assets.view;

import android.view.View;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: EmailAutoHintPop.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/assets/view/EmailAutoHintPop$show$1$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EmailAutoHintPop$show$1$1 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Ref.ObjectRef<String> f19093i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Function1<String, Unit> f19094j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ EmailAutoHintPop f19095k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailAutoHintPop$show$1$1(List<String> list, Ref.ObjectRef<String> objectRef, Function1<? super String, Unit> function1, EmailAutoHintPop emailAutoHintPop, int i11) {
        super(i11, list);
        this.f19093i = objectRef;
        this.f19094j = function1;
        this.f19095k = emailAutoHintPop;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final Unit m20027i(Function1 function1, Ref.ObjectRef objectRef, String str, EmailAutoHintPop emailAutoHintPop) {
        function1.invoke(((String) objectRef.element) + '@' + str);
        emailAutoHintPop.f19092a.dismiss();
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder baseViewHolder, final String str) {
        if (baseViewHolder == null || str == null) {
            return;
        }
        C27096v0 c27096v0 = new C27096v0();
        String str2 = this.f19093i.element;
        C27017c c27017c = C27017c.f54310a;
        baseViewHolder.setText(R$id.tv_email, c27096v0.m66905e(str2, c27017c.m66512a(R$color.emphasis40)).m66905e('@' + str, c27017c.m66512a(R$color.emphasis)));
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final Function1<String, Unit> function1 = this.f19094j;
        final Ref.ObjectRef<String> objectRef = this.f19093i;
        final EmailAutoHintPop emailAutoHintPop = this.f19095k;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.view.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailAutoHintPop$show$1$1.m20027i(function1, objectRef, str, emailAutoHintPop);
            }
        }, 1, null);
    }
}
