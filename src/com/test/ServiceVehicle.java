package com.test;

class ServiceVehicle extends Vehicle implements ServiceOperations {

    private String serviceCenterName;
    private String serviceCategory;

    
    public ServiceVehicle(String ownerName,String vehicleNumber,String vehicleType, String serviceCenterName,String serviceCategory) {
       super(ownerName, vehicleNumber, vehicleType);

        this.serviceCenterName = serviceCenterName;
        this.serviceCategory = serviceCategory;
    }

    
    
    public void updateServiceCategory(String category) {
    	 if (category == null) {
             System.out.println("Invalid Service Category");
         } else {
             this.serviceCategory = category;
             System.out.println("Service Category Updated Successfully");
         }
    }
    public void updateServiceCenter(String center) {
		if(center == null) {
			System.out.println("Invalid Service Center");
		}else {
			this.serviceCenterName=center;
			System.out.println("Service Center Updated Successfully");
		}
		
	}
    public void displayProfile() {

        System.out.println("Vehicle Details");
        System.out.println("----------------------------------------");
        System.out.println("Owner Name          : " +getOwnerName());
        System.out.println("Vehicle Number      : " +getVehicleNumber());
        System.out.println("Vehicle Type        : " +getVehicleType());
        System.out.println("Service Center      : " +serviceCenterName);
        System.out.println("Service Category    : " +serviceCategory);
    }

	
}