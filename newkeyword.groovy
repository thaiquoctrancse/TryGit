package newpackage
import com.kms.katalon.core.annotation.Keyword


class newkeyword {
	/**
	 * Refresh browser
	 */
	@Keyword
	def printHello(String name) {
		println 'Hello guys !!!' + name;
	}
}
