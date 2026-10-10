package com.jumio.core.interfaces;

import com.jumio.core.models.ApiCallDataModel;
import java.util.List;
import jumio.core.C40635a4;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\fÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/interfaces/UsabilityInterface;", "", "shouldEnableUsability", "", "getShouldEnableUsability", "()Z", "getMultipartItemsForResultKeys", "", "Lcom/jumio/core/interfaces/UsabilityInterface$MultipartItem;", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", "MultipartItem", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface UsabilityInterface {
    @NotNull
    List<C40635a4> getMultipartItemsForResultKeys(@NotNull ApiCallDataModel<?> apiCallDataModel);

    boolean getShouldEnableUsability();
}
