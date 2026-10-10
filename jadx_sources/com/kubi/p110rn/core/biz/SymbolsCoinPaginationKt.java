package com.kubi.p110rn.core.biz;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SymbolsCoinPagination.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0002\u001a\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a&\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"MAX_SYMBOLS_COIN_PAGE_SIZE", "", "paginate", "Lcom/kubi/rn/core/biz/SymbolsCoinPage;", ExifInterface.GPS_DIRECTION_TRUE, "", "pageIndex", "", "pageSize", "symbolsCoinPageRequest", "Lcom/kubi/rn/core/biz/SymbolsCoinPageRequest;", "request", "toPositiveIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "BReactNativeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolsCoinPagination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolsCoinPagination.kt\ncom/kubi/rn/core/biz/SymbolsCoinPaginationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public final class SymbolsCoinPaginationKt {
    public static final int MAX_SYMBOLS_COIN_PAGE_SIZE = 200;

    @Nullable
    public static final <T> SymbolsCoinPage<T> paginate(@NotNull List<? extends T> list, @NotNull String pageIndex, @NotNull String pageSize) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        SymbolsCoinPageRequest symbolsCoinPageRequest = symbolsCoinPageRequest(pageIndex, pageSize);
        if (symbolsCoinPageRequest == null) {
            return null;
        }
        return paginate(list, symbolsCoinPageRequest);
    }

    @Nullable
    public static final SymbolsCoinPageRequest symbolsCoinPageRequest(@NotNull String pageIndex, @NotNull String pageSize) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Integer positiveIntOrNull = toPositiveIntOrNull(pageIndex);
        if (positiveIntOrNull == null) {
            return null;
        }
        int iIntValue = positiveIntOrNull.intValue();
        Integer positiveIntOrNull2 = toPositiveIntOrNull(pageSize);
        if (positiveIntOrNull2 == null) {
            return null;
        }
        if (positiveIntOrNull2.intValue() > 200) {
            positiveIntOrNull2 = null;
        }
        if (positiveIntOrNull2 != null) {
            return new SymbolsCoinPageRequest(iIntValue, positiveIntOrNull2.intValue());
        }
        return null;
    }

    @NotNull
    public static final <T> SymbolsCoinPage<T> paginate(@NotNull List<? extends T> list, @NotNull SymbolsCoinPageRequest request) {
        List list2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        int pageIndex = request.getPageIndex();
        int pageSize = request.getPageSize();
        long j11 = pageSize;
        long j12 = (((long) pageIndex) - 1) * j11;
        long jMin = Math.min(j11 + j12, list.size());
        if (j12 >= list.size()) {
            list2 = CollectionsKt.emptyList();
        } else {
            list2 = CollectionsKt.toList(list.subList((int) j12, (int) jMin));
        }
        return new SymbolsCoinPage<>(list2, pageIndex, pageSize, list.size(), jMin < ((long) list.size()));
    }

    private static final Integer toPositiveIntOrNull(String str) {
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull == null || intOrNull.intValue() <= 0) {
            return null;
        }
        return intOrNull;
    }
}
