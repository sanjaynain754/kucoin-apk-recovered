package com.kubi.mine.lib.p101ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.kubi.mine.R$id;
import com.kubi.mine.R$mipmap;
import com.kubi.mine.lib.entity.SocialMediaEntity;
import com.kubi.mine.lib.exception.MineException;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import p419l2.C42032f;
import p569qq.C43846g;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ContactUsFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/mine/lib/ui/ContactUsFragment$createAdater$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/mine/lib/entity/SocialMediaEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nContactUsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactUsFragment.kt\ncom/kubi/mine/lib/ui/ContactUsFragment$createAdater$1\n+ 2 MineIssue.kt\ncom/kubi/mine/lib/exception/MineIssueKt\n*L\n1#1,174:1\n44#2,2:175\n*S KotlinDebug\n*F\n+ 1 ContactUsFragment.kt\ncom/kubi/mine/lib/ui/ContactUsFragment$createAdater$1\n*L\n110#1:175,2\n*E\n"})
public final class ContactUsFragment$createAdater$1 extends BaseQuickAdapter<SocialMediaEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ContactUsFragment f35181i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactUsFragment$createAdater$1(List<SocialMediaEntity> list, ContactUsFragment contactUsFragment, int i11) {
        super(i11, list);
        this.f35181i = contactUsFragment;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final SocialMediaEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        C46340c<Drawable> c46340cMo6606a = C46338a.m102151a(helper.itemView.getContext()).mo6634v(item.getIcon()).mo6606a(new C42032f().mo92188b0(R$mipmap.mine_ic_avatar_placeholder));
        View view = helper.getView(R$id.iv_icon);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.ImageView");
        c46340cMo6606a.m6594E0((ImageView) view);
        helper.setText(R$id.tv_title, item.getTitle());
        View view2 = helper.getView(R$id.fl_root);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        final ContactUsFragment contactUsFragment = this.f35181i;
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContactUsFragment$createAdater$1.m41925i(item, contactUsFragment);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m41925i(SocialMediaEntity socialMediaEntity, ContactUsFragment contactUsFragment) {
        if (Intrinsics.areEqual("微信", socialMediaEntity.getPlatform())) {
            contactUsFragment.m41923y3(socialMediaEntity);
        } else {
            try {
                contactUsFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(socialMediaEntity.getLink())));
            } catch (Throwable th2) {
                C43846g.m96568c(new MineException(th2, "ContactUsFragment", false, null, 8, null), null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
