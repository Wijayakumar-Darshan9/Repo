import axios from "axios";
import React, { useEffect, useState } from "react";
import "./AdminLabReport.css";

const AdminDashboard = () => {
  const [reports, setReports] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    const fetchReports = async () => {
      setLoading(true);
      setError(null);
  
      try {
        const response = await axios.get("http://localhost:8085/api/lab-reports");
        setReports(response.data);
      } catch (err) {
        console.error("Error fetching reports:", err.response || err.message);
        setError("Failed to fetch reports. Please try again later.");
      } finally {
        setLoading(false);
      }
    };
  
    fetchReports();
  }, []);
  
  const handleDelete = async (id) => {
    try {
        await axios.delete(`http://localhost:8085/api/lab-reports/${id}`);
        setReports(reports.filter((report) => report.id !== id));
    } catch (error) {
        console.error(error);
        alert("Failed to delete report.");
    }
};


  return (
    <div className="admin-dashboard">
      <h2>Admin Dashboard</h2>
      {loading && <p>Loading reports...</p>}
      {error && <p className="error-message">{error}</p>}
      {!loading && !error && reports.length === 0 && <p>No reports found.</p>}
      <table>
        <thead>
          <tr>
            <th>Patient Name</th>
            <th>Test Name</th>
            <th>File</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {reports.map((report) => (
            <tr key={report.id}>
              <td>{report.patientName}</td>
              <td>{report.testName}</td>
              <td>
              <a href={report.fileUrl} target="_blank" rel="noopener noreferrer">View
              </a>
              </td>
              <td>
                <button onClick={() => handleDelete(report.id)}>Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default AdminDashboard;
