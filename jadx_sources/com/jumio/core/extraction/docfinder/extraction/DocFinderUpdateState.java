package com.jumio.core.extraction.docfinder.extraction;

import com.jumio.core.extraction.ExtractionUpdateState;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;", "Lcom/jumio/core/extraction/ExtractionUpdateState;", "<init>", "()V", "validCorners", "", "getValidCorners", "()I", "invalidCorners", "getInvalidCorners", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DocFinderUpdateState extends ExtractionUpdateState {

    @NotNull
    public static final DocFinderUpdateState INSTANCE = new DocFinderUpdateState();

    /* JADX INFO: renamed from: v */
    public static final int f14061v;

    /* JADX INFO: renamed from: w */
    public static final int f14062w;

    static {
        ExtractionUpdateState.Companion companion = ExtractionUpdateState.INSTANCE;
        f14061v = companion.getId().getAndIncrement();
        f14062w = companion.getId().getAndIncrement();
    }

    public final int getInvalidCorners() {
        return f14062w;
    }

    public final int getValidCorners() {
        return f14061v;
    }
}
