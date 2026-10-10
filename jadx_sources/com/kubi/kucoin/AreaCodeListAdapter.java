package com.kubi.kucoin;

import android.widget.ImageView;
import com.kubi.kucoin.data.AreaCodeModel;
import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.utils.extensions.core.C27034h;
import io.chad.library.adapter.base.BaseSectionQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.C45583m0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AreaCodeListAdapter.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010\u0010\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/kucoin/AreaCodeListAdapter;", "Lio/chad/library/adapter/base/BaseSectionQuickAdapter;", "Lcom/kubi/kucoin/data/AreaCodeModel;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "fromType", "Lcom/kubi/kucoin/SceneCode;", "getFromType", "()Lcom/kubi/kucoin/SceneCode;", "setFromType", "(Lcom/kubi/kucoin/SceneCode;)V", "convertHead", "", "helper", "item", "convert", "canShowflagIcon", "", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AreaCodeListAdapter extends BaseSectionQuickAdapter<AreaCodeModel, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public SceneCode f27582i;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable AreaCodeModel areaCodeModel) {
        CountryEntity countryEntity = areaCodeModel != null ? (CountryEntity) areaCodeModel.f86727t : null;
        if (countryEntity == null) {
            return;
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(com.kubi.app.country.R$id.tv_country, countryEntity.getEn());
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(com.kubi.app.country.R$id.tv_code, countryEntity.getMobileCode());
        }
        if (countryEntity.isDismissed()) {
            if (baseViewHolder != null) {
                baseViewHolder.setTextColor(com.kubi.app.country.R$id.tv_country, C27034h.m66632c(baseViewHolder, com.kubi.app.country.R$color.c_text40));
            }
            if (baseViewHolder != null) {
                baseViewHolder.setTextColor(com.kubi.app.country.R$id.tv_code, C27034h.m66632c(baseViewHolder, com.kubi.app.country.R$color.c_text30));
            }
            if (baseViewHolder != null) {
                baseViewHolder.setGone(com.kubi.app.country.R$id.not_support, true);
            }
        } else {
            if (baseViewHolder != null) {
                baseViewHolder.setTextColor(com.kubi.app.country.R$id.tv_country, C27034h.m66632c(baseViewHolder, com.kubi.app.country.R$color.c_text));
            }
            if (baseViewHolder != null) {
                baseViewHolder.setTextColor(com.kubi.app.country.R$id.tv_code, C27034h.m66632c(baseViewHolder, com.kubi.app.country.R$color.c_text));
            }
            if (baseViewHolder != null) {
                baseViewHolder.setGone(com.kubi.app.country.R$id.not_support, false);
            }
        }
        if (m31872g()) {
            if (baseViewHolder != null) {
                baseViewHolder.setVisible(com.kubi.app.country.R$id.iv_flag, true);
            }
            C45583m0.m100623f(baseViewHolder != null ? (ImageView) baseViewHolder.getView(com.kubi.app.country.R$id.iv_flag) : null, countryEntity.getIco());
        } else if (baseViewHolder != null) {
            baseViewHolder.setGone(com.kubi.app.country.R$id.iv_flag, false);
        }
    }

    public AreaCodeListAdapter() {
        super(com.kubi.app.country.R$layout.busercenter_item_signup_area_code, com.kubi.app.country.R$layout.busercenter_item_signup_area_code_header, new ArrayList());
        this.f27582i = SceneCode.KEY_CHOOSE_TYPE_FOR_DEFAULT;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m31872g() {
        return this.f27582i == SceneCode.WITHDRAW_COUNTRY_CODE;
    }

    @Override // io.chad.library.adapter.base.BaseSectionQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convertHead(@Nullable BaseViewHolder baseViewHolder, @Nullable AreaCodeModel areaCodeModel) {
        if (baseViewHolder != null) {
            baseViewHolder.setText(com.kubi.app.country.R$id.tv_content, areaCodeModel != null ? areaCodeModel.header : null);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m31875j(@NotNull SceneCode sceneCode) {
        Intrinsics.checkNotNullParameter(sceneCode, "<set-?>");
        this.f27582i = sceneCode;
    }
}
