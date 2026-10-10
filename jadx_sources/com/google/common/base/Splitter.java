package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final Strategy strategy;
    private final CharMatcher trimmer;

    public static final class MapSplitter {
        private static final String INVALID_ENTRY_MESSAGE = "Chunk [%s] is not a valid entry";
        private final Splitter entrySplitter;
        private final Splitter outerSplitter;

        private MapSplitter(Splitter splitter, Splitter splitter2) {
            this.outerSplitter = splitter;
            this.entrySplitter = (Splitter) Preconditions.checkNotNull(splitter2);
        }

        public Map<String, String> split(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.outerSplitter.split(charSequence)) {
                Iterator itSplittingIterator = this.entrySplitter.splittingIterator(str);
                Preconditions.checkArgument(itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
                String str2 = (String) itSplittingIterator.next();
                Preconditions.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                Preconditions.checkArgument(itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
                linkedHashMap.put(str2, (String) itSplittingIterator.next());
                Preconditions.checkArgument(!itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }
    }

    public static abstract class SplittingIterator extends AbstractIterator<String> {
        int limit;
        int offset = 0;
        final boolean omitEmptyStrings;
        final CharSequence toSplit;
        final CharMatcher trimmer;

        public abstract int separatorEnd(int i11);

        public abstract int separatorStart(int i11);

        @Override // com.google.common.base.AbstractIterator
        public String computeNext() {
            int i11 = this.offset;
            while (true) {
                int i12 = this.offset;
                if (i12 == -1) {
                    return endOfData();
                }
                int iSeparatorStart = separatorStart(i12);
                if (iSeparatorStart == -1) {
                    iSeparatorStart = this.toSplit.length();
                    this.offset = -1;
                } else {
                    this.offset = separatorEnd(iSeparatorStart);
                }
                int i13 = this.offset;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    this.offset = i14;
                    if (i14 > this.toSplit.length()) {
                        this.offset = -1;
                    }
                } else {
                    while (i11 < iSeparatorStart && this.trimmer.matches(this.toSplit.charAt(i11))) {
                        i11++;
                    }
                    while (iSeparatorStart > i11 && this.trimmer.matches(this.toSplit.charAt(iSeparatorStart - 1))) {
                        iSeparatorStart--;
                    }
                    if (!this.omitEmptyStrings || i11 != iSeparatorStart) {
                        int i15 = this.limit;
                        if (i15 == 1) {
                            iSeparatorStart = this.toSplit.length();
                            this.offset = -1;
                            while (iSeparatorStart > i11 && this.trimmer.matches(this.toSplit.charAt(iSeparatorStart - 1))) {
                                iSeparatorStart--;
                            }
                        } else {
                            this.limit = i15 - 1;
                        }
                        return this.toSplit.subSequence(i11, iSeparatorStart).toString();
                    }
                    i11 = this.offset;
                }
            }
        }

        public SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.trimmer = splitter.trimmer;
            this.omitEmptyStrings = splitter.omitEmptyStrings;
            this.limit = splitter.limit;
            this.toSplit = charSequence;
        }
    }

    public interface Strategy {
        Iterator<String> iterator(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: on */
    public static Splitter m13379on(char c11) {
        return m13380on(CharMatcher.m13370is(c11));
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    public MapSplitter withKeyValueSeparator(String str) {
        return withKeyValueSeparator(m13381on(str));
    }

    private Splitter(Strategy strategy, boolean z11, CharMatcher charMatcher, int i11) {
        this.strategy = strategy;
        this.omitEmptyStrings = z11;
        this.trimmer = charMatcher;
        this.limit = i11;
    }

    public static Splitter fixedLength(final int i11) {
        Preconditions.checkArgument(i11 > 0, "The length may not be less than 1");
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.4
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.4.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i12) {
                        int i13 = i12 + i11;
                        if (i13 < this.toSplit.length()) {
                            return i13;
                        }
                        return -1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i12) {
                        return i12;
                    }
                };
            }
        });
    }

    /* JADX INFO: renamed from: on */
    public static Splitter m13380on(final CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.1
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.1.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i11) {
                        return i11 + 1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i11) {
                        return charMatcher.indexIn(this.toSplit, i11);
                    }
                };
            }
        });
    }

    public static Splitter onPatternInternal(final CommonPattern commonPattern) {
        Preconditions.checkArgument(!commonPattern.matcher("").matches(), "The pattern may not match the empty string: %s", commonPattern);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.3
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                final CommonMatcher commonMatcherMatcher = commonPattern.matcher(charSequence);
                return new SplittingIterator(this, splitter, charSequence) { // from class: com.google.common.base.Splitter.3.1
                    final /* synthetic */ C79903 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i11) {
                        return commonMatcherMatcher.end();
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i11) {
                        if (commonMatcherMatcher.find(i11)) {
                            return commonMatcherMatcher.start();
                        }
                        return -1;
                    }
                };
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.iterator(this, charSequence);
    }

    public Splitter limit(int i11) {
        Preconditions.checkArgument(i11 > 0, "must be greater than zero: %s", i11);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i11);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }

    public MapSplitter withKeyValueSeparator(char c11) {
        return withKeyValueSeparator(m13379on(c11));
    }

    @GwtIncompatible
    public static Splitter onPattern(String str) {
        return onPatternInternal(Platform.compilePattern(str));
    }

    public Iterable<String> split(final CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return new Iterable<String>(this) { // from class: com.google.common.base.Splitter.5
            final /* synthetic */ Splitter this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public Iterator<String> iterator() {
                return this.this$0.splittingIterator(charSequence);
            }

            public String toString() {
                Joiner joinerM13373on = Joiner.m13373on(", ");
                StringBuilder sb2 = new StringBuilder();
                sb2.append('[');
                StringBuilder sbAppendTo = joinerM13373on.appendTo(sb2, (Iterable<? extends Object>) this);
                sbAppendTo.append(']');
                return sbAppendTo.toString();
            }
        };
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> itSplittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itSplittingIterator.hasNext()) {
            arrayList.add(itSplittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public MapSplitter withKeyValueSeparator(Splitter splitter) {
        return new MapSplitter(splitter);
    }

    /* JADX INFO: renamed from: on */
    public static Splitter m13381on(final String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return m13379on(str.charAt(0));
        }
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.2
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.2.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i11) {
                        return i11 + str.length();
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i11) {
                        int length = str.length();
                        int length2 = this.toSplit.length() - length;
                        while (i11 <= length2) {
                            for (int i12 = 0; i12 < length; i12++) {
                                if (this.toSplit.charAt(i12 + i11) != str.charAt(i12)) {
                                    i11++;
                                }
                            }
                            return i11;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    @GwtIncompatible
    /* JADX INFO: renamed from: on */
    public static Splitter m13382on(Pattern pattern) {
        return onPatternInternal(new JdkPattern(pattern));
    }
}
