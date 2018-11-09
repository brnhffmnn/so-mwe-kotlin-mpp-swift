import UIKit
import so_mwe_kotlin_mpp_swift

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(18)
        
        // call Kotlin code here
        label.text = SampleKt.hello(something: MySwiftClass())
        view.addSubview(label)
    }
}

class MySwiftClass: NSObject, MyKotlinInterface {
    
    var itemCount = 3
    
    func run() -> KotlinSequence {
        // only mirrored helper method accessible
        return SequenceHelperKt.generateSequence() {
            self.itemCount -= 1
            return (self.itemCount >= 0) ? "test" : nil
        }
    }
}
