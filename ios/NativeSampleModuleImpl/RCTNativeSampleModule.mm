#import <Foundation/Foundation.h>
#include "RCTNativeSampleModule.h"

@implementation NativeSampleModule
RCT_EXPORT_MODULE()
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:(const facebook::react::ObjCTurboModule::InitParams &)params {
  return std::make_shared<facebook::react::NativeSampleModuleSpecJSI>(params);
}
- (NSString *)getHelloWorld:(NSString *)first second:(NSString *)second {
  return [NSString stringWithFormat:@"HelloWorld %@ %@", first, second];
}
@end
