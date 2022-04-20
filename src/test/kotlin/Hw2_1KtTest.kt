import org.junit.Test

import org.junit.Assert.*

class Hw2_1KtTest {

    @Test
    fun checkLimits_ForMaestro_PrevTransferLess600_000() {
        val paymentMethod: String = "Maestro"
        val previousTransfers: Int = 550_000
        val thisTransfer: Int = 10_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(true,result)
    }

    @Test
    fun checkLimits_ForMastercard_PrevTransferLess600_000() {
        val paymentMethod: String = "Mastercard"
        val previousTransfers: Int = 590_000
        val thisTransfer: Int = 10_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(true,result)
    }

    @Test
    fun checkLimits_ForVisa_PrevTransferLess600_000() {
        val paymentMethod: String = "Visa"
        val previousTransfers: Int = 590_000
        val thisTransfer: Int = 10_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(true,result)
    }

    @Test
    fun checkLimits_ForMir_PrevTransferMore600_000() {
        val paymentMethod: String = "Mir"
        val previousTransfers: Int = 600_000
        val thisTransfer: Int = 11_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(false, result)
    }

    @Test
    fun checkLimits_ForMaestro_PrevTransferMore600_000() {
        val paymentMethod: String = "Maestro"
        val previousTransfers: Int = 600_000
        val thisTransfer: Int = 15_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(false,result)
    }

    @Test
    fun checkLimits_ForMastercard_PrevTransferMore600_000() {
        val paymentMethod: String = "Mastercard"
        val previousTransfers: Int = 601_000
        val thisTransfer: Int = 10_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(false,result)
    }

    @Test
    fun checkLimits_ForVisa_PrevTransferMore600_000() {
        val paymentMethod: String = "Visa"
        val previousTransfers: Int = 620_000
        val thisTransfer: Int = 10_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(false,result)
    }

    @Test
    fun checkLimits_ForMir_PrevTransferLess600_000() {
        val paymentMethod: String = "Mir"
        val previousTransfers: Int = 590_000
        val thisTransfer: Int = 10_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(true, result)
    }

    @Test
    fun checkLimits_ForVisa_ThisTransferLess150_000(){
        val paymentMethod: String = "Visa"
        val previousTransfers: Int = 100_000
        val thisTransfer: Int = 150_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )
        assertEquals(true,result)
    }
    @Test
    fun checkLimits_ForMaestro_ThisTransferLess150_000(){
        val paymentMethod: String = "Maestro"
        val previousTransfers: Int = 100_000
        val thisTransfer: Int = 150_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )
        assertEquals(true,result)
    }

    @Test
    fun checkLimits_ForMastercard_ThisTransferLess150_000(){
        val paymentMethod: String = "Mastercard"
        val previousTransfers: Int = 100_000
        val thisTransfer: Int = 150_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )
        assertEquals(true,result)
    }

    @Test
    fun checkLimits_ForMir_ThisTransferLess150_000(){
        val paymentMethod: String = "Mir"
        val previousTransfers: Int = 100_000
        val thisTransfer: Int = 150_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )
        assertEquals(true,result)
    }

    @Test
    fun checkLimits_ForVK_ThisTransferLess15_000(){
        val paymentMethod: String = "VkPay"
        val previousTransfers: Int = 0
        val thisTransfer: Int = 10_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )
        assertEquals(true,result)
    }

    @Test
    fun checkLimits_ForVisa_ThisTransferMore150_000(){
        val paymentMethod: String = "Visa"
        val previousTransfers: Int = 100_000
        val thisTransfer: Int = 151_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )
        assertEquals(false,result)
    }
    @Test
    fun checkLimits_ForMaestro_ThisTransferMore150_000(){
        val paymentMethod: String = "Maestro"
        val previousTransfers: Int = 100_000
        val thisTransfer: Int = 152_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )
        assertEquals(false,result)
    }

    @Test
    fun checkLimits_ForMastercard_ThisTransferMore150_000(){
        val paymentMethod: String = "Mastercard"
        val previousTransfers: Int = 100_000
        val thisTransfer: Int = 155_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )
        assertEquals(false,result)
    }

    @Test
    fun checkLimits_ForMir_ThisTransferMore150_000(){
        val paymentMethod: String = "Mir"
        val previousTransfers: Int = 100_000
        val thisTransfer: Int = 153_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )
        assertEquals(false,result)
    }

    @Test
    fun checkLimits_ForVK_ThisTransferMore15_000(){
        val paymentMethod: String = "VkPay"
        val previousTransfers: Int = 0
        val thisTransfer: Int = 16_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )
        assertEquals(false,result)
    }

    @Test
    fun checkLimits_ForVK_SumLess40_000(){
        val paymentMethod: String = "VkPay"
        val previousTransfers: Int = 30_000
        val thisTransfer: Int = 9_000

        val result = checkLimits(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )
        assertEquals(true,result)
    }

    @Test
    fun calculateFeeForMaestroIfSumTransfersMore75_000(){
        val paymentMethod: String = "Maestro"
        val previousTransfers: Int = 100_000
        val thisTransfer: Int = 10_000

        val result = calculateFee(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(620.0,result,0.0001)
    }

    @Test
    fun calculateFeeForMaestroIfSumTransfersLess75_000(){
        val paymentMethod: String = "Maestro"
        val previousTransfers: Int = 50_000
        val thisTransfer: Int = 24_000

        val result = calculateFee(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(0.0,result,0.0001)
    }

    @Test
    fun calculateFeeForMastercardIfSumTransfersMore75_000(){
        val paymentMethod: String = "Mastercard"
        val previousTransfers: Int = 100_000
        val thisTransfer: Int = 10_000

        val result = calculateFee(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(620.0,result,0.0001)
    }

    @Test
    fun calculateFeeForMastercardIfSumTransfersLess75_000(){
        val paymentMethod: String = "Mastercard"
        val previousTransfers: Int = 50_000
        val thisTransfer: Int = 24_000

        val result = calculateFee(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(0.0,result,0.0001)
    }

    @Test
    fun calculateFeeForVisaIfSumTransfersFeeLess35(){
        val paymentMethod: String = "Visa"
        val previousTransfers: Int = 50_000
        val thisTransfer: Int = 200

        val result = calculateFee(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(35.0, result,0.0001)
    }

    @Test
    fun calculateFeeForVisaIfSumTransfersFeeMore35(){
        val paymentMethod: String = "Visa"
        val previousTransfers: Int = 50_000
        val thisTransfer: Int = 500

        val result = calculateFee(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(37.5, result,0.0001)
    }

    @Test
    fun calculateFeeForMirIfSumTransfersFeeLess35(){
        val paymentMethod: String = "Mir"
        val previousTransfers: Int = 50_000
        val thisTransfer: Int = 200

        val result = calculateFee(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(35.0, result,0.0001)
    }

    @Test
    fun calculateFeeForMirIfSumTransfersFeeMore35(){
        val paymentMethod: String = "Mir"
        val previousTransfers: Int = 50_000
        val thisTransfer: Int = 500

        val result = calculateFee(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(37.5, result,0.0001)
    }

    @Test
    fun calculateFeeForVkPay(){
        val paymentMethod: String = "VkPay"
        val previousTransfers: Int = 10_000
        val thisTransfer: Int = 200

        val result = calculateFee(
            typeOfPay = paymentMethod,
            sumOfPreviousTransfers = previousTransfers,
            sumOfThisTransfer = thisTransfer
        )

        assertEquals(0.0, result,0.0001)
    }



}