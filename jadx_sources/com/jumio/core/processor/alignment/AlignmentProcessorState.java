package com.jumio.core.processor.alignment;

import com.jumio.core.processor.ProcessorState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/alignment/AlignmentProcessorState;", "Lcom/jumio/core/processor/ProcessorState;", "CenterId", "TooClose", "MoveCloser", "HoldStraight", "Valid", "Invalid", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState$CenterId;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState$HoldStraight;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState$Invalid;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState$MoveCloser;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState$TooClose;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState$Valid;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface AlignmentProcessorState extends ProcessorState {

    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/processor/alignment/AlignmentProcessorState$CenterId;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CenterId implements AlignmentProcessorState {

        @NotNull
        public static final CenterId INSTANCE = new CenterId();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof CenterId);
        }

        @NotNull
        public String toString() {
            return "CenterId";
        }

        public int hashCode() {
            return 53048287;
        }
    }

    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/processor/alignment/AlignmentProcessorState$HoldStraight;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HoldStraight implements AlignmentProcessorState {

        @NotNull
        public static final HoldStraight INSTANCE = new HoldStraight();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof HoldStraight);
        }

        @NotNull
        public String toString() {
            return "HoldStraight";
        }

        public int hashCode() {
            return -738143000;
        }
    }

    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/processor/alignment/AlignmentProcessorState$Invalid;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Invalid implements AlignmentProcessorState {

        @NotNull
        public static final Invalid INSTANCE = new Invalid();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Invalid);
        }

        @NotNull
        public String toString() {
            return "Invalid";
        }

        public int hashCode() {
            return -1751784312;
        }
    }

    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/processor/alignment/AlignmentProcessorState$MoveCloser;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class MoveCloser implements AlignmentProcessorState {

        @NotNull
        public static final MoveCloser INSTANCE = new MoveCloser();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof MoveCloser);
        }

        @NotNull
        public String toString() {
            return "MoveCloser";
        }

        public int hashCode() {
            return 527097978;
        }
    }

    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/processor/alignment/AlignmentProcessorState$TooClose;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TooClose implements AlignmentProcessorState {

        @NotNull
        public static final TooClose INSTANCE = new TooClose();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof TooClose);
        }

        @NotNull
        public String toString() {
            return "TooClose";
        }

        public int hashCode() {
            return -115261293;
        }
    }

    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/processor/alignment/AlignmentProcessorState$Valid;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Valid implements AlignmentProcessorState {

        @NotNull
        public static final Valid INSTANCE = new Valid();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Valid);
        }

        @NotNull
        public String toString() {
            return "Valid";
        }

        public int hashCode() {
            return 1623192269;
        }
    }
}
