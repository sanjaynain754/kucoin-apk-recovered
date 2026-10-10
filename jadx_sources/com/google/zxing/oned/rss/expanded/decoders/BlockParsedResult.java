package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes56.dex */
final class BlockParsedResult {
    private final DecodedInformation decodedInformation;
    private final boolean finished;

    public BlockParsedResult(boolean z11) {
        this(null, z11);
    }

    public BlockParsedResult(DecodedInformation decodedInformation, boolean z11) {
        this.finished = z11;
        this.decodedInformation = decodedInformation;
    }

    public DecodedInformation getDecodedInformation() {
        return this.decodedInformation;
    }

    public boolean isFinished() {
        return this.finished;
    }
}
