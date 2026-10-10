package com.kubi.kucoin.data;

import androidx.annotation.Keep;
import com.kubi.kucoin.data.platform.model.CountryEntity;
import io.chad.library.adapter.base.entity.SectionEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AreaCodeModel.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kucoin/data/AreaCodeModel;", "Lio/chad/library/adapter/base/entity/SectionEntity;", "Lcom/kubi/kucoin/data/platform/model/CountryEntity;", "isHeader", "", "header", "", "<init>", "(ZLjava/lang/String;)V", "countryEntity", "(Lcom/kubi/kucoin/data/platform/model/CountryEntity;)V", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AreaCodeModel extends SectionEntity<CountryEntity> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AreaCodeModel(boolean z11, @NotNull String header) {
        super(z11, header);
        Intrinsics.checkNotNullParameter(header, "header");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AreaCodeModel(@NotNull CountryEntity countryEntity) {
        super(countryEntity);
        Intrinsics.checkNotNullParameter(countryEntity, "countryEntity");
    }
}
