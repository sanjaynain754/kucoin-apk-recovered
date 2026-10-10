package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.TrackOutput;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
class SampleDataQueue {
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final Allocator allocator;
    private AllocationNode firstAllocationNode;
    private AllocationNode readAllocationNode;
    private final ParsableByteArray scratch;
    private long totalBytesWritten;
    private AllocationNode writeAllocationNode;

    public static final class AllocationNode implements Allocator.AllocationNode {

        @Nullable
        public Allocation allocation;
        public long endPosition;

        @Nullable
        public AllocationNode next;
        public long startPosition;

        public AllocationNode clear() {
            this.allocation = null;
            AllocationNode allocationNode = this.next;
            this.next = null;
            return allocationNode;
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator.AllocationNode
        public Allocation getAllocation() {
            return (Allocation) Assertions.checkNotNull(this.allocation);
        }

        public void initialize(Allocation allocation, AllocationNode allocationNode) {
            this.allocation = allocation;
            this.next = allocationNode;
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator.AllocationNode
        @Nullable
        public Allocator.AllocationNode next() {
            AllocationNode allocationNode = this.next;
            if (allocationNode == null || allocationNode.allocation == null) {
                return null;
            }
            return allocationNode;
        }

        public void reset(long j11, int i11) {
            Assertions.checkState(this.allocation == null);
            this.startPosition = j11;
            this.endPosition = j11 + ((long) i11);
        }

        public int translateOffset(long j11) {
            return ((int) (j11 - this.startPosition)) + this.allocation.offset;
        }

        public AllocationNode(long j11, int i11) {
            reset(j11, i11);
        }
    }

    private static AllocationNode readData(AllocationNode allocationNode, long j11, ByteBuffer byteBuffer, int i11) {
        AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j11);
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (nodeContainingPosition.endPosition - j11));
            byteBuffer.put(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j11), iMin);
            i11 -= iMin;
            j11 += (long) iMin;
            if (j11 == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    public int sampleData(DataReader dataReader, int i11, boolean z11) throws IOException {
        int iPreAppend = preAppend(i11);
        AllocationNode allocationNode = this.writeAllocationNode;
        int i12 = dataReader.read(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), iPreAppend);
        if (i12 != -1) {
            postAppend(i12);
            return i12;
        }
        if (z11) {
            return -1;
        }
        throw new EOFException();
    }

    private void clearAllocationNodes(AllocationNode allocationNode) {
        if (allocationNode.allocation == null) {
            return;
        }
        this.allocator.release(allocationNode);
        allocationNode.clear();
    }

    private static AllocationNode getNodeContainingPosition(AllocationNode allocationNode, long j11) {
        while (j11 >= allocationNode.endPosition) {
            allocationNode = allocationNode.next;
        }
        return allocationNode;
    }

    private void postAppend(int i11) {
        long j11 = this.totalBytesWritten + ((long) i11);
        this.totalBytesWritten = j11;
        AllocationNode allocationNode = this.writeAllocationNode;
        if (j11 == allocationNode.endPosition) {
            this.writeAllocationNode = allocationNode.next;
        }
    }

    private int preAppend(int i11) {
        AllocationNode allocationNode = this.writeAllocationNode;
        if (allocationNode.allocation == null) {
            allocationNode.initialize(this.allocator.allocate(), new AllocationNode(this.writeAllocationNode.endPosition, this.allocationLength));
        }
        return Math.min(i11, (int) (this.writeAllocationNode.endPosition - this.totalBytesWritten));
    }

    private static AllocationNode readEncryptionData(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder, ParsableByteArray parsableByteArray) {
        long j11 = sampleExtrasHolder.offset;
        int unsignedShort = 1;
        parsableByteArray.reset(1);
        AllocationNode data = readData(allocationNode, j11, parsableByteArray.getData(), 1);
        long j12 = j11 + 1;
        byte b11 = parsableByteArray.getData()[0];
        boolean z11 = (b11 & 128) != 0;
        int i11 = b11 & 127;
        CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
        byte[] bArr = cryptoInfo.f2933iv;
        if (bArr == null) {
            cryptoInfo.f2933iv = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        AllocationNode data2 = readData(data, j12, cryptoInfo.f2933iv, i11);
        long j13 = j12 + ((long) i11);
        if (z11) {
            parsableByteArray.reset(2);
            data2 = readData(data2, j13, parsableByteArray.getData(), 2);
            j13 += 2;
            unsignedShort = parsableByteArray.readUnsignedShort();
        }
        int i12 = unsignedShort;
        int[] iArr = cryptoInfo.numBytesOfClearData;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z11) {
            int i13 = i12 * 6;
            parsableByteArray.reset(i13);
            data2 = readData(data2, j13, parsableByteArray.getData(), i13);
            j13 += (long) i13;
            parsableByteArray.setPosition(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = parsableByteArray.readUnsignedShort();
                iArr4[i14] = parsableByteArray.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = sampleExtrasHolder.size - ((int) (j13 - sampleExtrasHolder.offset));
        }
        TrackOutput.CryptoData cryptoData = (TrackOutput.CryptoData) Util.castNonNull(sampleExtrasHolder.cryptoData);
        cryptoInfo.set(i12, iArr2, iArr4, cryptoData.encryptionKey, cryptoInfo.f2933iv, cryptoData.cryptoMode, cryptoData.encryptedBlocks, cryptoData.clearBlocks);
        long j14 = sampleExtrasHolder.offset;
        int i15 = (int) (j13 - j14);
        sampleExtrasHolder.offset = j14 + ((long) i15);
        sampleExtrasHolder.size -= i15;
        return data2;
    }

    public void discardDownstreamTo(long j11) {
        AllocationNode allocationNode;
        if (j11 == -1) {
            return;
        }
        while (true) {
            allocationNode = this.firstAllocationNode;
            if (j11 < allocationNode.endPosition) {
                break;
            }
            this.allocator.release(allocationNode.allocation);
            this.firstAllocationNode = this.firstAllocationNode.clear();
        }
        if (this.readAllocationNode.startPosition < allocationNode.startPosition) {
            this.readAllocationNode = allocationNode;
        }
    }

    public void discardUpstreamSampleBytes(long j11) {
        Assertions.checkArgument(j11 <= this.totalBytesWritten);
        this.totalBytesWritten = j11;
        if (j11 != 0) {
            AllocationNode allocationNode = this.firstAllocationNode;
            if (j11 != allocationNode.startPosition) {
                while (this.totalBytesWritten > allocationNode.endPosition) {
                    allocationNode = allocationNode.next;
                }
                AllocationNode allocationNode2 = (AllocationNode) Assertions.checkNotNull(allocationNode.next);
                clearAllocationNodes(allocationNode2);
                AllocationNode allocationNode3 = new AllocationNode(allocationNode.endPosition, this.allocationLength);
                allocationNode.next = allocationNode3;
                if (this.totalBytesWritten == allocationNode.endPosition) {
                    allocationNode = allocationNode3;
                }
                this.writeAllocationNode = allocationNode;
                if (this.readAllocationNode == allocationNode2) {
                    this.readAllocationNode = allocationNode3;
                    return;
                }
                return;
            }
        }
        clearAllocationNodes(this.firstAllocationNode);
        AllocationNode allocationNode4 = new AllocationNode(this.totalBytesWritten, this.allocationLength);
        this.firstAllocationNode = allocationNode4;
        this.readAllocationNode = allocationNode4;
        this.writeAllocationNode = allocationNode4;
    }

    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public void peekToBuffer(DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        readSampleData(this.readAllocationNode, decoderInputBuffer, sampleExtrasHolder, this.scratch);
    }

    public void readToBuffer(DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        this.readAllocationNode = readSampleData(this.readAllocationNode, decoderInputBuffer, sampleExtrasHolder, this.scratch);
    }

    public void reset() {
        clearAllocationNodes(this.firstAllocationNode);
        this.firstAllocationNode.reset(0L, this.allocationLength);
        AllocationNode allocationNode = this.firstAllocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
        this.totalBytesWritten = 0L;
        this.allocator.trim();
    }

    public void rewind() {
        this.readAllocationNode = this.firstAllocationNode;
    }

    public SampleDataQueue(Allocator allocator) {
        this.allocator = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.allocationLength = individualAllocationLength;
        this.scratch = new ParsableByteArray(32);
        AllocationNode allocationNode = new AllocationNode(0L, individualAllocationLength);
        this.firstAllocationNode = allocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
    }

    private static AllocationNode readSampleData(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder, ParsableByteArray parsableByteArray) {
        if (decoderInputBuffer.isEncrypted()) {
            allocationNode = readEncryptionData(allocationNode, decoderInputBuffer, sampleExtrasHolder, parsableByteArray);
        }
        if (decoderInputBuffer.hasSupplementalData()) {
            parsableByteArray.reset(4);
            AllocationNode data = readData(allocationNode, sampleExtrasHolder.offset, parsableByteArray.getData(), 4);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            sampleExtrasHolder.offset += 4;
            sampleExtrasHolder.size -= 4;
            decoderInputBuffer.ensureSpaceForWrite(unsignedIntToInt);
            AllocationNode data2 = readData(data, sampleExtrasHolder.offset, decoderInputBuffer.data, unsignedIntToInt);
            sampleExtrasHolder.offset += (long) unsignedIntToInt;
            int i11 = sampleExtrasHolder.size - unsignedIntToInt;
            sampleExtrasHolder.size = i11;
            decoderInputBuffer.resetSupplementalData(i11);
            return readData(data2, sampleExtrasHolder.offset, decoderInputBuffer.supplementalData, sampleExtrasHolder.size);
        }
        decoderInputBuffer.ensureSpaceForWrite(sampleExtrasHolder.size);
        return readData(allocationNode, sampleExtrasHolder.offset, decoderInputBuffer.data, sampleExtrasHolder.size);
    }

    private static AllocationNode readData(AllocationNode allocationNode, long j11, byte[] bArr, int i11) {
        AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j11);
        int i12 = i11;
        while (i12 > 0) {
            int iMin = Math.min(i12, (int) (nodeContainingPosition.endPosition - j11));
            System.arraycopy(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j11), bArr, i11 - i12, iMin);
            i12 -= iMin;
            j11 += (long) iMin;
            if (j11 == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    public void sampleData(ParsableByteArray parsableByteArray, int i11) {
        while (i11 > 0) {
            int iPreAppend = preAppend(i11);
            AllocationNode allocationNode = this.writeAllocationNode;
            parsableByteArray.readBytes(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), iPreAppend);
            i11 -= iPreAppend;
            postAppend(iPreAppend);
        }
    }
}
