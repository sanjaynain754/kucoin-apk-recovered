package org.jsoup.select;

import org.jsoup.nodes.AbstractC43189g;

/* JADX INFO: loaded from: classes61.dex */
public interface NodeFilter {

    public enum FilterResult {
        CONTINUE,
        SKIP_CHILDREN,
        SKIP_ENTIRELY,
        REMOVE,
        STOP
    }

    /* JADX INFO: renamed from: a */
    FilterResult mo95269a(AbstractC43189g abstractC43189g, int i11);

    /* JADX INFO: renamed from: b */
    FilterResult mo95270b(AbstractC43189g abstractC43189g, int i11);
}
