package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.data.country.Country;
import com.jumio.core.model.StaticModel;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\b\t¨\u0006\n"}, m90084d2 = {"Lcom/jumio/core/models/SelectionModel;", "Lcom/jumio/core/model/StaticModel;", "country", "Lcom/jumio/core/data/country/Country;", "<init>", "(Lcom/jumio/core/data/country/Country;)V", "getCountry", "()Lcom/jumio/core/data/country/Country;", "Lcom/jumio/core/models/DigitalSelectionModel;", "Lcom/jumio/core/models/PhysicalSelectionModel;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("SelectionModel")
public abstract class SelectionModel implements StaticModel {

    /* JADX INFO: renamed from: a */
    public final Country f14323a;

    @NotNull
    /* JADX INFO: renamed from: getCountry, reason: from getter */
    public final Country getF14323a() {
        return this.f14323a;
    }

    public SelectionModel(Country country, DefaultConstructorMarker defaultConstructorMarker) {
        this.f14323a = country;
    }
}
