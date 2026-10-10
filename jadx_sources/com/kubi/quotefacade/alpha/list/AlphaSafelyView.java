package com.kubi.quotefacade.alpha.list;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.utils.C27059l;
import com.kubi.utils.extensions.C27046k;
import cv.ChainSafeEntity;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p809yu.C46581n;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.alpha.list.v0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IAlphaListItemView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\r"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaSafelyView;", "Lcom/kubi/quotefacade/alpha/list/IAlphaListItemView;", "<init>", "()V", "render", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "parseAlphaSafeDataList", "", "Lcom/kubi/quotefacade/entity/ChainSafeEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlphaSafelyView implements IAlphaListItemView {
    /* JADX INFO: renamed from: d */
    public static final Unit m50669d(ImageView imageView, AlphaSafelyView alphaSafelyView, AlphaItemEntity alphaItemEntity) {
        C46581n c46581n = new C46581n();
        Intrinsics.checkNotNull(imageView);
        c46581n.m102736b(imageView, alphaSafelyView.m50670c(alphaItemEntity));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.quotefacade.alpha.list.IAlphaListItemView
    /* JADX INFO: renamed from: a */
    public void mo50661a(@NotNull BaseViewHolder helper, @NotNull final AlphaItemEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final ImageView imageView = (ImageView) helper.getView(R$id.ivSingleLine);
        FrameLayout frameLayout = (FrameLayout) helper.getView(R$id.ivContainer);
        Intrinsics.checkNotNull(frameLayout);
        C27046k.m66685H(frameLayout);
        String securityScore = item.getSecurityScore();
        if (securityScore != null) {
            int iHashCode = securityScore.hashCode();
            if (iHashCode != -1650372460) {
                if (iHashCode != 82033) {
                    if (iHashCode == 69066467 && securityScore.equals("Green")) {
                        imageView.setImageResource(R$drawable.ic_security_green);
                    }
                } else if (securityScore.equals("Red")) {
                    imageView.setImageResource(R$drawable.ic_security_red);
                }
            } else if (securityScore.equals("Yellow")) {
                imageView.setImageResource(R$drawable.ic_security_yellow);
            }
            frameLayout.setOnClickListener(null);
            C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.quotefacade.alpha.list.u0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlphaSafelyView.m50669d(imageView, this, item);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<ChainSafeEntity> m50670c(AlphaItemEntity alphaItemEntity) {
        ArrayList arrayList = new ArrayList();
        C27059l c27059l = C27059l.f54343a;
        arrayList.add(new ChainSafeEntity(c27059l.m66757a().getString(R$string.quote_chain_safe_dialog_foundry), Boolean.valueOf(alphaItemEntity.getMintable()), Boolean.valueOf(!alphaItemEntity.getMintable())));
        arrayList.add(new ChainSafeEntity(c27059l.m66757a().getString(R$string.quote_chain_safe_dialog_lock), Boolean.valueOf(!alphaItemEntity.getUnlockedLiquidity()), Boolean.valueOf(!alphaItemEntity.getUnlockedLiquidity())));
        arrayList.add(new ChainSafeEntity(c27059l.m66757a().getString(R$string.quote_chain_safe_dialog_fund), Boolean.valueOf(alphaItemEntity.getAdminRightsRetained()), Boolean.valueOf(!alphaItemEntity.getAdminRightsRetained())));
        arrayList.add(new ChainSafeEntity(c27059l.m66757a().getString(R$string.quote_chain_safe_dialog_verify), Boolean.valueOf(!alphaItemEntity.getClosedSourceContract()), Boolean.valueOf(!alphaItemEntity.getClosedSourceContract())));
        arrayList.add(new ChainSafeEntity(c27059l.m66757a().getString(R$string.quote_chain_safe_dialog_black), Boolean.valueOf(alphaItemEntity.getInBlacklist()), Boolean.valueOf(!alphaItemEntity.getInBlacklist())));
        arrayList.add(new ChainSafeEntity(c27059l.m66757a().getString(R$string.quote_chain_safe_dialog_freeze), Boolean.valueOf(alphaItemEntity.getFreezableContract()), Boolean.valueOf(!alphaItemEntity.getFreezableContract())));
        return arrayList;
    }
}
