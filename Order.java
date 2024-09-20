package backend;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "order_number")
	    private String orderNumber;

	    @Column(name = "status")
	    private String status;

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getOrderNumber1() {
	        return orderNumber;
	    }

	    public void setOrderNumber(String orderNumber) {
	        this.orderNumber = orderNumber;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

		public String getOrderNumber() {
			// TODO Auto-generated method stub
			return null;
		}
	}

