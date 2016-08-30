/******************************************************************************
 * Copyright © 2013-2016 The Nxt Core Developers.                             *
 *                                                                            *
 * See the AUTHORS.txt, DEVELOPER-AGREEMENT.txt and LICENSE.txt files at      *
 * the top-level directory of this distribution for the individual copyright  *
 * holder information and the developer policies on copyright and licensing.  *
 *                                                                            *
 * Unless otherwise agreed in a custom licensing agreement, no part of the    *
 * Nxt software, including this file, may be copied, modified, propagated,    *
 * or distributed except according to the terms contained in the LICENSE.txt  *
 * file.                                                                      *
 *                                                                            *
 * Removal or modification of this copyright notice is prohibited.            *
 *                                                                            *
 ******************************************************************************/

package nxt;

import java.math.BigInteger;
import java.util.Arrays;

public final class Genesis {

    public static final long GENESIS_BLOCK_ID = -2519068587061523893L;
    public static final long CREATOR_ID = -1651176381630278200L;
    public static final byte[] CREATOR_PUBLIC_KEY = {
            -36, 84, 92, -64, 81, -64, 94, 79, -29, 49, -103, 50, 121, -49, 32, -81, -22, 89, -62, 10, -46, 65, -107, -92, -36, -118, 50, -123, -42, -94, 35, 75
    };

    public static final long[] GENESIS_RECIPIENTS = new long[5];
    static final long[] SORTED_GENESIS_RECIPIENTS;
    public static final int[] GENESIS_AMOUNTS = new int[5];
    public static final byte[][] GENESIS_SIGNATURES = new byte[5][];

    static{
        GENESIS_AMOUNTS[0] = 2000000000;
        GENESIS_AMOUNTS[1] = 2000000000;
        GENESIS_AMOUNTS[2] = 2000000000;
        GENESIS_AMOUNTS[3] = 2000000000;
        GENESIS_AMOUNTS[4] = 2000000000;


        GENESIS_RECIPIENTS[0] = (new BigInteger("10755217982884379704")).longValue();
        GENESIS_RECIPIENTS[1] = (new BigInteger("13235388316834093618")).longValue();
        GENESIS_RECIPIENTS[2] = (new BigInteger("4933544296528578313")).longValue();
        GENESIS_RECIPIENTS[3] = (new BigInteger("6520444218398470610")).longValue();
        GENESIS_RECIPIENTS[4] = (new BigInteger("4646452217770796522")).longValue();


        SORTED_GENESIS_RECIPIENTS = Arrays.copyOf(GENESIS_RECIPIENTS, GENESIS_RECIPIENTS.length);
        Arrays.sort(SORTED_GENESIS_RECIPIENTS);

        GENESIS_SIGNATURES[0] = new byte[]{
                -1, -20, 53, -106, 124, -93, -38, 111, 71, -114, -124, -80, -83, -68, -60, 127, -15, 75, 102, -32, -63, 73, 103, -80, -43, -36, 127, 56, -59, 37, -9, 5, 68, -27, 33, -41, 43, -28, 88, 95, -17, -54, 118, -91, 102, 126, -120, 21, 77, 10, 77, -124, -103, -1, -19, 30, -74, 7, 64, -116, -69, 34, 18, 11
        };
        GENESIS_SIGNATURES[1] = new byte[]{
                -23, -124, -85, 21, -113, -75, 44, -7, -72, -72, -108, 16, 68, -59, -65, 21, 77, -44, 7, -117, -21, 5, 0, 29, -122, 23, 41, -20, 105, -57, 0, 8, 62, -71, -85, -111, 4, -13, 43, -53, 60, 16, 108, 125, -58, 63, -45, 42, 72, -68, -58, -57, 95, -61, 71, -11, 76, -41, -30, 95, 105, 25, 42, 93
        };
        GENESIS_SIGNATURES[2] = new byte[]{
                62, -106, 85, -126, 105, 106, -47, 32, 90, 27, -48, -31, 50, -102, -72, 111, 38, 22, 3, 30, 68, -32, 84, -91, 8, -1, -16, -50, 29, 83, 109, 9, 15, -11, -122, 117, 87, -7, -26, 17, 7, -34, -3, 49, 85, 112, -2, 122, -55, 1, -107, -72, 105, -1, -112, -109, 86, -105, -105, 15, -102, -41, 118, -12
        };
        GENESIS_SIGNATURES[3] = new byte[]{
                -22, 57, -103, 14, -107, -127, -21, -117, 118, -29, 90, -92, -41, -16, 2, -91, -50, -17, -89, 19, 83, 33, -111, 13, 96, -76, -24, 126, -24, 100, -41, 10, 122, -99, 16, -105, -110, 118, -49, -10, -39, -38, -102, -24, -9, -73, 33, -50, 32, 41, 41, -61, -73, -59, 64, -79, 113, 120, 100, -101, -74, -108, 95, -25
        };
        GENESIS_SIGNATURES[4] = new byte[]{
                -34, -35, 42, 116, 78, 16, -50, -1, -55, 103, -103, 2, 61, 109, 72, -36, 33, 4, 3, 80, 77, 73, 45, -33, -115, 116, -53, 80, 22, -8, -108, 9, 102, 36, 118, -15, -47, -106, 74, 37, -91, -25, 11, 32, 111, -89, -27, -6, -64, -79, 77, 62, 108, -112, -70, 101, -60, 32, 124, -49, -101, 21, -22, 125
        };


    }

    public static final byte[] GENESIS_BLOCK_SIGNATURE = new byte[]{
            14, 101, 98, -75, 55, -35, 51, -121, 119, -74, -124, 83, 108, 14, 34, -59, 47, 60, -31, -85, 90, 61, -62, 27, -86, 58, 78, 32, -78, -127, -72, 5, 93, -114, -74, 97, 91, -35, 117, -102, 10, 84, 30, -37, -34, -95, 97, 33, -89, -85, -66, -64, 20, 6, -63, -4, -20, 87, 42, 33, -115, -65, 57, 69
    };



    private Genesis() {} // never

}
