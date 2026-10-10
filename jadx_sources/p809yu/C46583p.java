package p809yu;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.entity.ChainItemEntity;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yu.p */
/* JADX INFO: compiled from: ChainListItemView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/ChainSafelyView;", "Lcom/kubi/quotefacade/adapter/IChainListItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46583p implements InterfaceC46592y {
    /* JADX INFO: renamed from: c */
    public static final void m102738c(ImageView imageView, ChainItemEntity chainItemEntity, View view) {
        C46581n c46581n = new C46581n();
        Intrinsics.checkNotNull(imageView);
        c46581n.m102736b(imageView, C46577j.m102733a(chainItemEntity));
    }

    @Override // p809yu.InterfaceC46592y
    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: a */
    public void mo102729a(@NotNull BaseViewHolder helper, @NotNull final ChainItemEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final ImageView imageView = (ImageView) helper.getView(R$id.iv_single_line);
        FrameLayout frameLayout = (FrameLayout) helper.getView(R$id.iv_container);
        frameLayout.setVisibility(0);
        Integer securityScore = item.getSecurityScore();
        if (securityScore != null) {
            int iIntValue = securityScore.intValue();
            if (iIntValue == 0) {
                imageView.setImageResource(R$drawable.ic_security_yellow);
            } else if (iIntValue == 1) {
                imageView.setImageResource(R$drawable.ic_security_red);
            } else if (iIntValue == 2) {
                imageView.setImageResource(R$drawable.ic_security_green);
            }
            frameLayout.setOnClickListener(null);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: yu.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C46583p.m102738c(imageView, item, view);
                }
            });
        }
    }
}
